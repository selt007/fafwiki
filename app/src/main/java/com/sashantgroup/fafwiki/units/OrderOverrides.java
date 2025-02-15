package  com.sashantgroup.fafwiki.units;

import com.fasterxml.jackson.annotation.*;

public class OrderOverrides {
    private DroneL ruleuccTransport;
    private DroneL ruleutcShieldToggle;
    private DroneL ruleutcIntelToggle;
    private DroneL ruleutcStealthToggle;
    private DroneL ruleutcWeaponToggle;
    private DroneL droneL;
    private DroneL ruleutcJammingToggle;
    private Ruleu ruleuccSiloBuildNuke;
    private Ruleu ruleuccNuke;
    private DroneL ruleutcProductionToggle;
    private DroneL ruleutcSpecialToggle;
    private DroneL droneR;
    private Ruleu ruleutcCloakToggle;

    @JsonProperty("RULEUCC_Transport")
    public DroneL getRuleuccTransport() { return ruleuccTransport; }
    @JsonProperty("RULEUCC_Transport")
    public void setRuleuccTransport(DroneL value) { this.ruleuccTransport = value; }

    @JsonProperty("RULEUTC_ShieldToggle")
    public DroneL getRuleutcShieldToggle() { return ruleutcShieldToggle; }
    @JsonProperty("RULEUTC_ShieldToggle")
    public void setRuleutcShieldToggle(DroneL value) { this.ruleutcShieldToggle = value; }

    @JsonProperty("RULEUTC_IntelToggle")
    public DroneL getRuleutcIntelToggle() { return ruleutcIntelToggle; }
    @JsonProperty("RULEUTC_IntelToggle")
    public void setRuleutcIntelToggle(DroneL value) { this.ruleutcIntelToggle = value; }

    @JsonProperty("RULEUTC_StealthToggle")
    public DroneL getRuleutcStealthToggle() { return ruleutcStealthToggle; }
    @JsonProperty("RULEUTC_StealthToggle")
    public void setRuleutcStealthToggle(DroneL value) { this.ruleutcStealthToggle = value; }

    @JsonProperty("RULEUTC_WeaponToggle")
    public DroneL getRuleutcWeaponToggle() { return ruleutcWeaponToggle; }
    @JsonProperty("RULEUTC_WeaponToggle")
    public void setRuleutcWeaponToggle(DroneL value) { this.ruleutcWeaponToggle = value; }

    @JsonProperty("DroneL")
    public DroneL getDroneL() { return droneL; }
    @JsonProperty("DroneL")
    public void setDroneL(DroneL value) { this.droneL = value; }

    @JsonProperty("RULEUTC_JammingToggle")
    public DroneL getRuleutcJammingToggle() { return ruleutcJammingToggle; }
    @JsonProperty("RULEUTC_JammingToggle")
    public void setRuleutcJammingToggle(DroneL value) { this.ruleutcJammingToggle = value; }

    @JsonProperty("RULEUCC_SiloBuildNuke")
    public Ruleu getRuleuccSiloBuildNuke() { return ruleuccSiloBuildNuke; }
    @JsonProperty("RULEUCC_SiloBuildNuke")
    public void setRuleuccSiloBuildNuke(Ruleu value) { this.ruleuccSiloBuildNuke = value; }

    @JsonProperty("RULEUCC_Nuke")
    public Ruleu getRuleuccNuke() { return ruleuccNuke; }
    @JsonProperty("RULEUCC_Nuke")
    public void setRuleuccNuke(Ruleu value) { this.ruleuccNuke = value; }

    @JsonProperty("RULEUTC_ProductionToggle")
    public DroneL getRuleutcProductionToggle() { return ruleutcProductionToggle; }
    @JsonProperty("RULEUTC_ProductionToggle")
    public void setRuleutcProductionToggle(DroneL value) { this.ruleutcProductionToggle = value; }

    @JsonProperty("RULEUTC_SpecialToggle")
    public DroneL getRuleutcSpecialToggle() { return ruleutcSpecialToggle; }
    @JsonProperty("RULEUTC_SpecialToggle")
    public void setRuleutcSpecialToggle(DroneL value) { this.ruleutcSpecialToggle = value; }

    @JsonProperty("DroneR")
    public DroneL getDroneR() { return droneR; }
    @JsonProperty("DroneR")
    public void setDroneR(DroneL value) { this.droneR = value; }

    @JsonProperty("RULEUTC_CloakToggle")
    public Ruleu getRuleutcCloakToggle() { return ruleutcCloakToggle; }
    @JsonProperty("RULEUTC_CloakToggle")
    public void setRuleutcCloakToggle(Ruleu value) { this.ruleutcCloakToggle = value; }
}
