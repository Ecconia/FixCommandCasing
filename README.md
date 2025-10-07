# Ecconia's Fix Command Casing

## For?

Minecraft Fabric 1.20.8\
Also requires the Fabric-API.

## What does it do?

Ever since Mojang updated their command framework to Brigadier, commands are case-sensitive.\
If you are as incompetent as me, you will hold the SHIFT key for too long when typing / and thus causing the next letters to be capital too.\
Which breaks the command execution and tab completion.

This mod forces commands (not subcommands/arguments), to be lower cased.\
You won't be able to type upper-case in the root command anymore.\
Which fully prevents the issue from happening.

## Warning: No uppercase anymore!

You will NOT be able to type any command with uppercase letters anymore!\
Subcommands and arguments are not affected.

This mod only works on servers / with plugins that do things right and register only lower-case commands.
