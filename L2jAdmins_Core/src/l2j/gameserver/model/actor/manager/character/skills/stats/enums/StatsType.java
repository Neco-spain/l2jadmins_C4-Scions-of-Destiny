package l2j.gameserver.model.actor.manager.character.skills.stats.enums;

/**
 * Enum of basic stats.
 * @author mkizub
 */
public enum StatsType
{
	// Base stats, for each in Calculator a slot is allocated ---------------------------------------------
	
	MAX_HP,
	MAX_MP,
	MAX_CP,
	REG_HP_RATE,
	REG_CP_RATE,
	REG_MP_RATE,
	RECHARGE_MP_RATE,
	HEAL_HP_RATE,
	
	// Atk & Def
	
	PHYSICAL_DEFENCE,
	MAGICAL_DEFENCE,
	PHYSICAL_ATTACK,
	MAGICAL_ATTACK,
	PHYSICAL_ATTACK_SPEED,
	MAGICAL_ATTACK_SPEED,
	MAGICAL_SKILL_REUSE,
	PHYSICAL_ATTACK_REUSE,
	PHYSICAL_SKILL_REUSE,
	
	SHIELD_DEFENCE_POWER,
	PHYSICAL_CRITICAL_POWER,
	PHYSICAL_CRITICAL_POWER_ADD,
	PVP_PHYSICAL_DMG,
	PVP_MAGICAL_DMG,
	PVP_PHYS_SKILL_DMG,
	VALAKAS_PHYSICAL_DMG,
	
	// Atk & Def rates
	EVASION_RATE,
	SHIELD_DEFENCE_RATE,
	SHIELD_DEFENCE_ANGLE,
	PHYSICAL_CRITICAL_RATE,
	MAGICAL_CRITICAL_RATE,
	EXPSP_RATE,
	BLOW_RATE,
	ATTACK_CANCEL_RATE,
	
	// Accuracy and range
	ACCURACY_COMBAT,
	PHYSICAL_ATTACK_RANGE,
	MAGICAL_ATTACK_RANGE,
	PHYSICAL_ATTACK_ANGLE,
	PHYSICAL_ATTACK_COUNT_MAX,
	
	WALK_SPEED,
	RUN_SPEED,
	
	// Player-only stats
	STAT_STR,
	STAT_CON,
	STAT_DEX,
	STAT_INT,
	STAT_WIT,
	STAT_MEN,
	
	// Special stats, share one slot in Calculator --------------------------------------------------------
	
	// Water breath
	BREATH,
	
	// Terrain damage
	FALL,
	
	// Various stats
	AGGRESSION,
	BLEED,
	POISON,
	STUN,
	ROOT,
	MOVEMENT,
	CONFUSION,
	SLEEP,
	
	// Resists
	AGGRESSION_VULN,
	BLEED_VULN,
	POISON_VULN,
	STUN_VULN,
	PARALYZE_VULN,
	ROOT_VULN,
	SLEEP_VULN,
	CONFUSION_VULN,
	MOVEMENT_VULN,
	FIRE_VULN,
	WIND_VULN,
	WATER_VULN,
	EARTH_VULN,
	HOLY_VULN,
	DARK_VULN,
	CANCEL_VULN,
	DERANGEMENT_VULN,
	DEBUFF_VULN,
	VALAKAS_VULN,
	
	NONE_WPN_VULN, // Shields!!!
	SWORD_WPN_VULN,
	BLUNT_WPN_VULN,
	DAGGER_WPN_VULN,
	BOW_WPN_VULN,
	POLE_WPN_VULN,
	ETC_WPN_VULN,
	FIST_WPN_VULN,
	DUAL_WPN_VULN,
	DUALFIST_WPN_VULN,
	
	// -----------------------------------------------------------------------------
	
	REFLECT_PHYSICAL_DAMAGE,
	REFLECT_MAGICAL_SKILL,
	REFLECT_PHYSICAL_SKILL,
	ABSORB_DAMAGE_PERCENT,
	TRANSFER_DAMAGE_PERCENT,
	
	MAX_LOAD,
	
	PHYSICAL_ATK_PLANTS,
	PHYSICAL_ATK_INSECTS,
	PHYSICAL_ATK_ANIMALS,
	PHYSICAL_ATK_MONSTERS,
	PHYSICAL_ATK_DRAGONS,
	PHYSICAL_ATK_UNDEAD,
	PHYSICAL_ATK_GIANTS,
	PHYSICAL_ATK_MAGIC_CREATURES,
	PHYSICAL_DEF_UNDEAD,
	
	// ExSkill
	INVENTORY_LIMIT,
	WARE_HOUSE_LIMIT,
	FREIGHT_LIMIT,
	PRIVATE_SELL_LIMIT,
	PRIVATE_BUY_LIMIT,
	RECIPE_DWARF_LIMIT,
	RECIPE_COMMON_LIMIT,
	
	// C4 Stats
	PHYSICAL_MP_CONSUME_RATE,
	MAGICAL_MP_CONSUME_RATE,
	HP_CONSUME_RATE,
	MP_CONSUME_RATE,
	
	// Skill mastery
	SKILL_MASTERY,
	
	SOUL_SHOT_COUNT;// TODO dise??ar esto q no tiene funcion alguna
	
	public static final int NUM_STATS = values().length;
}
