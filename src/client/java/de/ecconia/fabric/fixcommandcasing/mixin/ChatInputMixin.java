package de.ecconia.fabric.fixcommandcasing.mixin;

import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChatScreen.class)
public class ChatInputMixin
{
	@Shadow protected TextFieldWidget chatField;
	
	@Inject(method = "onChatFieldUpdate", at = @At("HEAD"))
	private void onInputChange(String chatText, CallbackInfo ci)
	{
		String text = this.chatField.getText();
		if(text.isEmpty() || text.charAt(0) != '/')
		{
			return;
		}
		int indexOfSpace = text.indexOf(' ');
		if(indexOfSpace < 0)
		{
			indexOfSpace = text.length();
		}
		//Overwrite the command with lowercase letters. Fully disallow any uppercase letter:
		this.chatField.text = '/' + text.substring(1, indexOfSpace).toLowerCase() + text.substring(indexOfSpace);
	}
}
