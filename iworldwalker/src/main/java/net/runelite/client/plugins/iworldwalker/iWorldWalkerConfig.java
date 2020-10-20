/*
 * Copyright (c) 2018, SomeoneWithAnInternetConnection
 * Copyright (c) 2018, oplosthee <https://github.com/oplosthee>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.iworldwalker;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigTitleSection;
import net.runelite.client.config.Range;
import net.runelite.client.config.Title;

@ConfigGroup("iWorldWalker")
public interface iWorldWalkerConfig extends Config
{

	@ConfigSection(
		keyName = "delayConfig",
		name = "Sleep Delay Configuration",
		description = "Configure how the bot handles sleep delays",
		position = 1
	)
	default boolean delayConfig()
	{
		return false;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepMin",
		name = "Sleep Min",
		description = "",
		position = 2,
		section = "delayConfig"
	)
	default int sleepMin()
	{
		return 60;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepMax",
		name = "Sleep Max",
		description = "",
		position = 3,
		section = "delayConfig"
	)
	default int sleepMax()
	{
		return 350;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepTarget",
		name = "Sleep Target",
		description = "",
		position = 4,
		section = "delayConfig"
	)
	default int sleepTarget()
	{
		return 100;
	}

	@Range(
		min = 0,
		max = 550
	)
	@ConfigItem(
		keyName = "sleepDeviation",
		name = "Sleep Deviation",
		description = "",
		position = 5,
		section = "delayConfig"
	)
	default int sleepDeviation()
	{
		return 10;
	}

	@ConfigItem(
		keyName = "sleepWeightedDistribution",
		name = "Sleep Weighted Distribution",
		description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
		position = 6,
		section = "delayConfig"
	)
	default boolean sleepWeightedDistribution()
	{
		return false;
	}

	@ConfigSection(
		keyName = "delayTickConfig",
		name = "Game Tick Configuration",
		description = "Configure how the bot handles game tick delays, 1 game tick equates to roughly 600ms",
		position = 7
	)
	default boolean delayTickConfig()
	{
		return false;
	}

	@Range(
		min = 0,
		max = 10
	)
	@ConfigItem(
		keyName = "tickDelayMin",
		name = "Game Tick Min",
		description = "",
		position = 8,
		section = "delayTickConfig"
	)
	default int tickDelayMin()
	{
		return 1;
	}

	@Range(
		min = 0,
		max = 10
	)
	@ConfigItem(
		keyName = "tickDelayMax",
		name = "Game Tick Max",
		description = "",
		position = 9,
		section = "delayTickConfig"
	)
	default int tickDelayMax()
	{
		return 3;
	}

	@Range(
		min = 0,
		max = 10
	)
	@ConfigItem(
		keyName = "tickDelayTarget",
		name = "Game Tick Target",
		description = "",
		position = 10,
		section = "delayTickConfig"
	)
	default int tickDelayTarget()
	{
		return 2;
	}

	@Range(
		min = 0,
		max = 10
	)
	@ConfigItem(
		keyName = "tickDelayDeviation",
		name = "Game Tick Deviation",
		description = "",
		position = 11,
		section = "delayTickConfig"
	)
	default int tickDelayDeviation()
	{
		return 1;
	}

	@ConfigItem(
		keyName = "tickDelayWeightedDistribution",
		name = "Game Tick Weighted Distribution",
		description = "Shifts the random distribution towards the lower end at the target, otherwise it will be an even distribution",
		position = 12,
		section = "delayTickConfig"
	)
	default boolean tickDelayWeightedDistribution()
	{
		return false;
	}

	@ConfigSection(
		keyName = "instructionsTitle",
		name = "Instructions",
		description = "Instructions Title",
		position = 15
	)
	default boolean instructionsTitle()
	{
		return false;
	}

	@ConfigItem(
		keyName = "instructions",
		name = "",
		description = "Instructions. Don't enter anything into this field",
		position = 18,
		section = "instructionsTitle"
	)
	default String instructions()
	{
		return "Select your location from the drop-down or enter a custom location using x,y,z format. Use Location/Tile Location in Developer Tools to obtain a custom coordinate.";
	}

	@ConfigSection(
		keyName = "notesTitle",
		name = "Custom Notes",
		description = "Notes Title",
		position = 29
	)
	default boolean notesTitle()
	{
		return false;
	}

	@ConfigItem(
		keyName = "notepad",
		name = "",
		description = "Paste custom coords that you want to save for frequent use",
		section = "notesTitle",
		position = 30
	)
	default String notepad()
	{
		return "Paste custom co-ords that you want to save for frequent use";
	}

	@ConfigSection(
		keyName = "showQuestNotes",
		name = "Show Quest Notes",
		description = "Unhide the quest notes section, containing notes on supported quests",
		position = 31
	)
	default boolean showQuestNotes()
	{
		return false;
	}

	@ConfigItem(
		keyName = "supportedQuests",
		name = "Quests",
		description = "Dropdown of supported quests",
		position = 32,
		section = "showQuestNotes"
	)
	default Quest quest()
	{
		return Quest.CLIENT_OF_KOUREND;
	}

	@ConfigItem(
		keyName = "questNotesCOK",
		name = "Quest Notes",
		description = "Notes for supported quests",
		position = 33,
		hidden = true,
		unhide = "supportedQuests",
		unhideValue = "CLIENT_OF_KOUREND",
		section = "showQuestNotes"
	)
	default String questNotesCOK()
	{
		return Quest.CLIENT_OF_KOUREND.getNotes();
	}

	@ConfigItem(
		keyName = "questNotesBIO",
		name = "Quest Notes",
		description = "Notes for supported quests",
		position = 34,
		hidden = true,
		unhide = "supportedQuests",
		unhideValue = "BIOHAZARD",
		section = "showQuestNotes"
	)
	default String questNotesBIO()
	{
		return Quest.BIOHAZARD.getNotes();
	}

	@ConfigItem(
		keyName = "category",
		name = "Category",
		description = "Select the category of destinations",
		position = 41
	)
	default Category category()
	{
		return Category.NONE;
	}

	@ConfigItem(
		keyName = "catBanks",
		name = "Location",
		description = "Select the location to walk to",
		position = 42,
		hidden = true,
		unhide = "category",
		unhideValue = "BANKS"
	)
	default Banks catBanks()
	{
		return Banks.NONE;
	}

	@ConfigItem(
		keyName = "catCities",
		name = "Location",
		description = "Select the location to walk to",
		position = 43,
		hidden = true,
		unhide = "category",
		unhideValue = "CITIES"
	)
	default Cities catCities()
	{
		return Cities.NONE;
	}

	@ConfigItem(
		keyName = "catGuilds",
		name = "Location",
		description = "Select the location to walk to",
		position = 44,
		hidden = true,
		unhide = "category",
		unhideValue = "GUILDS"
	)
	default Guilds catGuilds()
	{
		return Guilds.NONE;
	}

	@ConfigItem(
		keyName = "catSkilling",
		name = "Location",
		description = "Select the location to walk to",
		position = 45,
		hidden = true,
		unhide = "category",
		unhideValue = "SKILLING"
	)
	default Skilling catSkilling()
	{
		return Skilling.NONE;
	}

	@ConfigItem(
		keyName = "catSlayer",
		name = "Location",
		description = "Select the location to walk to",
		position = 46,
		hidden = true,
		unhide = "category",
		unhideValue = "SLAYER"
	)
	default Slayer catSlayer()
	{
		return Slayer.NONE;
	}

	@ConfigItem(
		keyName = "catMisc",
		name = "Location",
		description = "Select the location to walk to",
		position = 47,
		hidden = true,
		unhide = "category",
		unhideValue = "MISC"
	)
	default Misc catMisc()
	{
		return Misc.NONE;
	}

	@ConfigItem(
		keyName = "customLocation",
		name = "Custom Location",
		description = "Enter a Coordinate to walk to. Co-ordinate format should be x,y,z. Turn on Location or Tile Location in Developer Tools to obtain coordinates.",
		position = 48,
		hidden = true,
		unhide = "category",
		unhideValue = "CUSTOM"
	)
	default String customLocation()
	{
		return "0,0,0";
	}

	@ConfigItem(
		keyName = "rand",
		name = "Random Tile radius",
		description = "A random radius value applied to tiles",
		position = 49
	)
	default int rand()
	{
		return 3;
	}


	@ConfigItem(
		keyName = "enableUI",
		name = "Enable UI",
		description = "Enable to turn on in game UI",
		position = 50
	)
	default boolean enableUI()
	{
		return true;
	}

	@ConfigItem(
		keyName = "startButton",
		name = "Start/Stop",
		description = "Start/Stop plugin",
		position = 51
	)
	default Button startButton()
	{
		return new Button();
	}
}
