package divinerpg.registries;

import divinerpg.DivineRPG;
import net.minecraftforge.registries.*;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import static divinerpg.DivineRPG.MODID;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);

    public static final RegistryObject<SoundEvent>     
    	ACID_HAG = registerSound("acid_hag"),
        ACID_HAG_HURT = registerSound("acid_hag_hurt"),
        ALICANTO = registerSound("alicanto"),
        ALICANTO_HURT = registerSound("alicanto_hurt"),
        ARCANIUM_SABER = registerSound("arcanium_saber"),
        ARCHER = registerSound("archer"),
        ARID_WARRIOR = registerSound("arid_warrior"),
        ARID_WARRIOR_HURT = registerSound("arid_warrior_hurt"),
        AYERACO = registerSound("ayeraco"),
        AYERACO_HALF_HEALTH = registerSound("ayeraco_half_health"),
        AYERACO_HURT = registerSound("ayeraco_hurt"),
        AYERACO_PILLAR = registerSound("ayeraco_pillar"),
        AYERACO_SPAWN = registerSound("ayeraco_spawn"),
        AYERACO_TELEPORT = registerSound("ayeraco_teleport"),
        BIPHRON = registerSound("biphron"),
        BIPHRON_HURT = registerSound("biphron_hurt"),
        BLITZ = registerSound("blitz"),
        BOHEMITE = registerSound("bohemite"),
        BOHEMITE_HURT = registerSound("bohemite_hurt"),
        GLINTHOP = registerSound("glinthop"),
        GLINTHOP_HURT = registerSound("glinthop_hurt"),
        CADILLION = registerSound("cadillion"),
        CAVE_CRAWLER_STEP = registerSound("cave_crawler_step"),
        CEILING_EXPLOSIONS = registerSound("ceiling_explosions"),
        CONSTRUCTOR_HURT = registerSound("constructor_hurt"),
        CONSTRUCTOR_PUNCH = registerSound("constructor_punch"),
        CORI = registerSound("cori"),
        CORI_HURT = registerSound("cori_hurt"),
        CORI_IDLE = registerSound("cori_idle"),
        CORI_SHOOT = registerSound("cori_shoot"),
        CRAB = registerSound("crab"),
        CRAB_HURT = registerSound("crab_hurt"),
        CRAWLER = registerSound("crawler"),
        CRAWLER_HURT = registerSound("crawler_hurt"),
        CROAK = registerSound("croak"),
        CYCLOPS = registerSound("cyclops"),
        CYCLOPS_HURT = registerSound("cyclops_hurt"),
        CYMESOID = registerSound("cymesoid"),
        CYMESOID_HURT = registerSound("cymesoid_hurt"),
        DEATHCRYX = registerSound("deathcryx"),
        DEATHCRYX_HURT = registerSound("deathcryx_hurt"),
        DEATH_HOUND = registerSound("death_hound"),
        DEATH_HOUND_HURT = registerSound("death_hound_hurt"),
        DEEP_LAUGH = registerSound("deep_laugh"),
        DEMON_OF_DARKNESS = registerSound("demon_of_darkness"),
        DENSOS = registerSound("densos"),
        DENSOS_HURT = registerSound("densos_hurt"),
        DISSIMENT = registerSound("dissiment"),
        DISSIMENT_HURT = registerSound("dissiment_hurt"),
        DIVINE_ACCUMULATOR = registerSound("divine_accumulator"),
        DRAMCRYX = registerSound("dramcryx"),
        DRAMCRYX_HURT = registerSound("dramcryx_hurt"),
        DRAMIX = registerSound("dramix"),
        DRAMIX_HURT = registerSound("dramix_hurt"),
        DREAMWRECKER = registerSound("dream_wrecker"),
        DREAMWRECKER_HURT = registerSound("dream_wrecker_hurt"),
        DUNGEON_PRISONER = registerSound("dungeon_prisoner"),
        DUNGEON_PRISONER_CHANGE = registerSound("dungeon_prisoner_change"),
        DUNGEON_PRISONER_HURT = registerSound("dungeon_prisoner_hurt"),
        DUO = registerSound("duo"),
        DUO_HURT = registerSound("duo_hurt"),
        ENDIKU = registerSound("endiku"),
        ENDIKU_HURT = registerSound("endiku_hurt"),
        ENT = registerSound("ent"),
        ENT_HURT = registerSound("ent_hurt"),
        EXPLOSIONS = registerSound("explosions"),
        FEEL_SOUL_ARKSIANE = registerSound("feel_soul_arksiane"),
        FIREFLY = registerSound("firefly"),
        FRACTITE = registerSound("fractite"),
        FRACTITE_ATTACK = registerSound("fractite_attack"),
        FRACTITE_CANNON = registerSound("fractite_cannon"),
        FRACTITE_HURT = registerSound("fractite_hurt"),
        FROST = registerSound("frost"),
        FROSTCLAW_CANNON = registerSound("frostclaw_cannon"),
        FROST_CANNON = registerSound("frost_cannon"),
        FROZEN_FLESH = registerSound("frozen_flesh"),
        FROZEN_FLESH_HURT = registerSound("frozen_flesh_hurt"),
        GALROID = registerSound("galroid"),
        GALROID_HURT = registerSound("galroid_hurt"),
        GHAST_CANNON = registerSound("ghast_cannon"),
        GLACIDE = registerSound("glacide"),
        GLACIDE_HURT = registerSound("glacide_hurt"),
        GOLEM = registerSound("golem"),
        GORGOSION = registerSound("gorgosion"),
        GORGOSION_HURT = registerSound("gorgosion_hurt"),
        GRIZZLE = registerSound("grizzle"),
        GRIZZLE_HURT = registerSound("grizzle_hurt"),
        GROWL = registerSound("growl"),
        GROWL_HURT = registerSound("growl_hurt"),
        HASTREUS = registerSound("hastreus"),
        HASTREUS_HURT = registerSound("hastreus_hurt"),
        HEAL = registerSound("heal"),
        HELIO = registerSound("helio"),
        HELIO_HURT = registerSound("helio_hurt"),
        HELL_SPIDER = registerSound("hell_spider"),
        HERBOMANCER = registerSound("herbomancer"),
        HERBOMANCER_HURT = registerSound("herbomancer_hurt"),
        HIGH_HIT = registerSound("high_hit"),
        HISS = registerSound("hiss"),
        HIVE_QUEEN = registerSound("hive_queen"),
        HIVE_QUEEN_HURT = registerSound("hive_queen_hurt"),
        HOVER_STINGER = registerSound("hover_stinger"),
        HOVER_STINGER_HURT = registerSound("hover_stinger_hurt"),
        ICEMAN = registerSound("iceman"),
        ICEMAN_HURT = registerSound("iceman_hurt"),
        INSECT = registerSound("insect"),
        JACKOMAN = registerSound("jackoman"),
        JUNGLE_SPIDER = registerSound("jungle_spider"),
        KAROS_INTRO = registerSound("karos_intro"),
        KAROS_LAUGH = registerSound("karos_laugh"),
        KAZROTIC = registerSound("kazrotic"),
        KAZROTIC_HURT = registerSound("kazrotic_hurt"),
        KING_OF_SCORCHERS = registerSound("king_of_scorchers"),
        KING_OF_SCORCHERS_HURT = registerSound("king_of_scorchers_hurt"),
        KOBBLIN = registerSound("kobblin"),
        LADY_LUNA = registerSound("lady_luna"),
        LADY_LUNA_HURT = registerSound("lady_luna_hurt"),
        LA_VEKOR = registerSound("la_vekor"),
        LHEIVA = registerSound("lheiva"),
        LHEIVA_HURT = registerSound("lheiva_hurt"),
        LIOPLEURODON = registerSound("liopleurodon"),
        LIOPLEURODON_HURT = registerSound("liopleurodon_hurt"),
        LIVESTOCK_MERCHANT = registerSound("livestock_merchant"),
        LIVESTOCK_MERCHANT_HURT = registerSound("livestock_merchant_hurt"),
        LORGA = registerSound("lorga"),
        LORGA_HURT = registerSound("lorga_hurt"),
        LORGAFLIGHT = registerSound("lorga_flight"),
        LORGAFLIGHT_HURT = registerSound("lorga_flight_hurt"),
        MADIVEL = registerSound("madivel"),
        MADIVEL_HURT = registerSound("madivel_hurt"),
        MAGE_FIRE = registerSound("mage_fire"),
        MANDRAGORA = registerSound("mandragora"),
        MEET_DOOM = registerSound("meet_doom"),
        MEGALITH = registerSound("megalith"),
        MEGALITH_HURT = registerSound("megalith_hurt"),
		MERCHANT_1 = registerSound("merchant_1"),
		MERCHANT_2 = registerSound("merchant_2"),
		MERCHANT_3 = registerSound("merchant_3"),
		MERCHANT_HURT = registerSound("merchant_hurt"),
        MUCKY = registerSound("mucky"),
        NESRO = registerSound("nesro"),
        NESRO_HURT = registerSound("nesro_hurt"),
        NOBODY_CAN_DEFEAT = registerSound("nobody_can_defeat"),
        PARASECTA = registerSound("parasecta"),
        PARASECTA_HURT = registerSound("parasecta_hurt"),
        PHASER = registerSound("phaser"),
        QUADRO_DIE_BEFORE = registerSound("quadro_die_before"),
        QUADRO_ENOUGH = registerSound("quadro_enough"),
        QUADRO_INCOMING_PUNCH = registerSound("quadro_incoming_punch"),
        QUADRO_IS_NEXT = registerSound("quadro_is_next"),
        QUADRO_KILL_MINE = registerSound("quadro_kill_mine"),
        QUADRO_MY_KILL = registerSound("quadro_my_kill"),
        QUADRO_NO_DIE = registerSound("quadro_no_die"),
        QUADRO_SIT_DOWN = registerSound("quadro_sit_down"),
        QUADRO_TASTE_FIST = registerSound("quadro_taste_fist"),
        RAGLOK_AVENGE = registerSound("raglok_avenge"),
        RAGLOK_AWAKEN = registerSound("raglok_awaken"),
        RAGLOK_DARK = registerSound("raglok_dark"),
        RAGLOK_GUARDIAN = registerSound("raglok_guardian"),
        RAGLOK_NOTHING = registerSound("raglok_nothing"),
        RAGLOK_RAIN = registerSound("raglok_rain"),
        RAINBOUR = registerSound("rainbour"),
        RAINBOUR_HURT = registerSound("rainbour_hurt"),
        RAZORBACK = registerSound("razorback"),
        RAZORBACK_HURT = registerSound("razorback_hurt"),
        REFLECTOR = registerSound("reflector"),
        REYVOR = registerSound("reyvor"),
        REYVOR_HURT = registerSound("reyvor_hurt"),
        ROAMER = registerSound("roamer"),
        ROAMER_HURT = registerSound("roamer_hurt"),
        ROAR = registerSound("roar"),
        ROLLUM = registerSound("rollum"),
        ROLLUM_HURT = registerSound("rollum_hurt"),
        ROTATICK = registerSound("rotatick"),
        ROTATICK_HURT = registerSound("rotatick_hurt"),
        SAGUARO_WORM = registerSound("saguaro_worm"),
        SCORCHER = registerSound("scorcher"),
        SERENADE = registerSound("serenade"),
        SHADAHIER = registerSound("shadahier"),
        SHADAHIER_HURT = registerSound("shadahier_hurt"),
        SHADOW_SABER = registerSound("shadow_saber"),
        SHARK = registerSound("shark"),
        SHARK_HURT = registerSound("shark_hurt"),
        SKYRE_DIE = registerSound("skyre_die"),
        SKYRE_SHOOT = registerSound("skyre_shoot"),
        SKYRE_AMBIENT = registerSound("skyre_ambient"),
        SKYRE_SPARK = registerSound("skyre_spark"),
        SOUND_OF_CAROLS = registerSound("sound_of_carols"),
        SOUND_OF_MUSIC = registerSound("sound_of_music"),
        SPARKLER = registerSound("sparkler"),
        STAFF = registerSound("staff"),
        STARLIGHT = registerSound("starlight"),
        STOP_AT_ONCE = registerSound("stop_at_once"),
        THE_EYE = registerSound("the_eye"),
        THE_EYE_HURT = registerSound("the_eye_hurt"),
        TOCAXIN = registerSound("tocaxin"),
        TOCAXIN_HURT = registerSound("tocaxin_hurt"),
        TRY_YOUR_BEST = registerSound("try_your_best"),
        VEREK = registerSound("verek"),
        VEREK_HURT = registerSound("verek_hurt"),
        VERMENOUS = registerSound("vermenous"),
        VERMENOUS_HURT = registerSound("vermenous_hurt"),
        VETHEA_BOW = registerSound("vethea_bow"),
        VETHEA_TELEPORT = registerSound("vethea_teleport"),
        VHRAAK = registerSound("vhraak"),
        VHRAAK_HURT = registerSound("vhraak_hurt"),
        WHALE = registerSound("whale"),
        WHALE_HURT = registerSound("whale_hurt"),
        WILDFIRE = registerSound("wildfire"),
        WILDFIRE_HURT = registerSound("wildfire_hurt"),
        WRAITH = registerSound("wraith"),
        WRAITH_HURT = registerSound("wraith_hurt"),
        WRECK_INTRO = registerSound("wreck_intro"),
        WRECK_SPEED = registerSound("wreck_speed"),
        WRECK_STRENGTH = registerSound("wreck_strength"),
        YOU_CANT_KILL_ME = registerSound("you_cant_kill_me"),
        ZONE = registerSound("zone"),
        ZONE_HURT = registerSound("zone_hurt"),
        ZORAGON = registerSound("zoragon"),
        ZORAGON_HURT = registerSound("zoragon_hurt"),
        SENG_AMBIENT = registerSound("seng_ambient"),
        SENG_GROWL = registerSound("seng_growl"),
        SENG_HURT = registerSound("seng_hurt"),
        SNAP = registerSound("snap"),

        ICEIKA_MUSIC = registerSound("iceika_music"),
        PATCHOULI_FLIP = registerSound("patchouli_flip"),
        PATCHOULI_OPEN = registerSound("patchouli_open"),
        MORTUM_AMBIENCE = registerSound("mortum_ambience"),
        MORTUM_MOOD = registerSound("mortum_mood");


    private static RegistryObject<SoundEvent> registerSound(String registryName) {
        return SOUNDS.register(registryName, () -> createSoundEvent(registryName));
    }

    private static SoundEvent createSoundEvent(String soundPath) {
        return SoundEvent.createVariableRangeEvent(new ResourceLocation(DivineRPG.MODID, soundPath));
    }
}