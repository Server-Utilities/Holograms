# Holograms
![Example image](https://i.imgur.com/g4Gff7D.png)
It's a simple mod that allows to create of server side holograms with full support for formatting and items.
Everything is created on packet level, which means commands or other mods shouldn't break them.

![Example image 2](https://i.imgur.com/7VacPE7.gif)

## Commands
You need to have `holograms.admin` and `holograms.main` permissions to use these commands.

* `/holograms` - Displays mod's version,
* `/holograms create <id>` - Creates new hologram,
* `/holograms remove <id>` - Removes selected hologram,
* `/holograms teleportTo <id>` - Teleports player to hologram,
* `/holograms info <id>` - Displays information about hologram,
* `/holograms modify <id> ...` - Modifies hologram:
  * `... update-rate <value>` - Changes how much time (in ticks, 1 sec = 20 ticks) needs to pass before placeholders are updated,
  * `... position [<optional coords>]` - Changes position of hologram
  * `... lines ...` - Changes content of hologram:
    * `... set <position> <line value...>` - Sets line to line value
    * `... add <line value...>` - Adds line to the end
    * `... insert <position> <line value...>` - Inserts line at position (moves everything after one line)
    * `... remove <position>` - Removes line at position


## Holograms API
If you are developer interested in using API, check [Hologram API repository](https://github.com/Patbox/HologramAPI)