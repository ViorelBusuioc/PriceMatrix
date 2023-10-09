package dev.vio.pricematrix;

public class HeavyPlate {

    private int thickness;
    private int width;
    private int length;
    private double qty;
    private double weightPerSheet;
    private int pieces;
    private String quality;
    private String galvanising;
    private String usTest;
    private String certificates;
    private String zTest;
    private String normalizing;
    private String tuv;
    private String dbs;
    private String sep;
    private String thicknessTolerances;
    private String sulphur;
    private String carbon;
    private String tensileTest;
    private String charpyTest;
    private String cev;
    private double exwPivot;
    private double freightCost;
    private double pivotItemPrice;
    private double thicknessAndWidthExtra;
    private double lengthExtra;
    private double qualityExtra;
    private double galvanisingExtra;
    private double usTestExtra;
    private double certificatesExtra;
    private double zTestExtra;
    private double normalizingExtra;
    private double tuvExtra;
    private double dbsExtra;
    private double sepExtra;
    private double thicknessTolerancesExtra;
    private double sulphurExtra;
    private double carbonExtra;
    private double tensileTestExtra;
    private double charpyTestExtra;
    private double cevExtra;
    private double plateUnitWeightExtra;
    private double effectiveFCAPrice;
    private double effectiveDAPPrice;
    private double value;
    private double variableCost;
    private double contribution;


    public HeavyPlate() {
    }

    public HeavyPlate(int thickness, int width, int length, int pieces, String quality, String galvanising, String usTest,
                      String certificates, String zTest, String normalizing, String tuv, String dbs, String sep,
                      String thicknessTolerances, String sulphur, String carbon, String tensileTest, String charpyTest,
                      String cev, double freightCost, double pivotItemPrice, double variableCost) {
        this.thickness = thickness;
        this.width = width;
        this.length = length;
        this.pieces = pieces;
        this.quality = quality;
        this.galvanising = galvanising;
        this.usTest = usTest;
        this.certificates = certificates;
        this.zTest = zTest;
        this.normalizing = normalizing;
        this.tuv = tuv;
        this.dbs = dbs;
        this.sep = sep;
        this.thicknessTolerances = thicknessTolerances;
        this.sulphur = sulphur;
        this.carbon = carbon;
        this.tensileTest = tensileTest;
        this.charpyTest = charpyTest;
        this.cev = cev;
        this.freightCost = freightCost;
        this.pivotItemPrice = pivotItemPrice;
        this.variableCost = variableCost;

        weightPerSheetCalc();
        qtyCalc();
        exwPivotCalc();
        t_w_lExtraCalc();
        qualityExtraCalc();
        usTestExtraCalc();
        certificatesAndZTestExtraCalc();
        nor_tuv_dbs_sep_tTExtraCalc();
        s_c_tensile_ExtraCalc();
        priceAndValueCalc();
    }

    public void weightPerSheetCalc() {

        double value = thickness * width * length * 7.85 / Math.pow(10, 9);

        if (width <= 1900) {
            if (value > 11.3) {
                weightPerSheet = Double.NaN;
            } else {
                weightPerSheet = value;
            }
        } else {
            if (value > 15) {
                weightPerSheet = Double.NaN;
            } else {
                weightPerSheet = value;
            }
        }
    }

    public void qtyCalc() {

        try {
            double val = Double.parseDouble(String.valueOf(weightPerSheet));
            qty = val * pieces;
            qty = (double) Math.round(qty * 1000) / 1000;
        } catch (NumberFormatException e) {
            qty = 0.0;
            qty = (double) Math.round(qty * 1000) / 1000;
        }
    }

    public void exwPivotCalc() {

        exwPivot = pivotItemPrice - freightCost;
    }

    public void t_w_lExtraCalc() {

        //Thick and Width Extra
        if (thickness <= 6.9) {
            if (width <= 2050) {thicknessAndWidthExtra = 100;}
            else if (width <= 2450) {thicknessAndWidthExtra = 115;}
            else if (width <= 3000) {thicknessAndWidthExtra = 125;}
            else if (width <= 3600) {thicknessAndWidthExtra = 150;}
            else {thicknessAndWidthExtra = Double.NaN;}
        }
        else if (thickness <= 7.9) {
            if (width <= 2050) {thicknessAndWidthExtra = 75;}
            else if (width <= 2450) {thicknessAndWidthExtra = 85;}
            else if (width <= 3000) {thicknessAndWidthExtra = 100;}
            else if (width <= 3600) {thicknessAndWidthExtra = 125;}
            else {thicknessAndWidthExtra = Double.NaN;}
        }
        else if (thickness <= 9.9) {
            if (width <= 2050) {thicknessAndWidthExtra = 0;}
            else if (width <= 2450) {thicknessAndWidthExtra = 0;}
            else if (width <= 3000) {thicknessAndWidthExtra = 40;}
            else if (width <= 3600) {thicknessAndWidthExtra = 70;}
            else {thicknessAndWidthExtra = 120;}
        }
        else if (thickness <= 50) {
            if (width <= 2050) {thicknessAndWidthExtra = 0;}
            else if (width <= 2450) {thicknessAndWidthExtra = 0;}
            else if (width <= 3000) {thicknessAndWidthExtra = 25;}
            else if (width <= 3600) {thicknessAndWidthExtra = 50;}
            else {thicknessAndWidthExtra = 100;}
        }
        else if (thickness <= 59.9) {
            if (width <= 2050) {thicknessAndWidthExtra = 15;}
            else if (width <= 2450) {thicknessAndWidthExtra = 15;}
            else if (width <= 3000) {thicknessAndWidthExtra = 40;}
            else if (width <= 3600) {thicknessAndWidthExtra = 65;}
            else {thicknessAndWidthExtra = 115;}
        }
        else if (thickness <= 79.9) {
            if (width <= 2050) {thicknessAndWidthExtra = 30;}
            else if (width <= 2450) {thicknessAndWidthExtra = 30;}
            else if (width <= 3000) {thicknessAndWidthExtra = 55;}
            else if (width <= 3600) {thicknessAndWidthExtra = 80;}
            else {thicknessAndWidthExtra = 130;}
        }
        else if (thickness <= 99.9) {
            if (width <= 2050) {thicknessAndWidthExtra = 60;}
            else if (width <= 2450) {thicknessAndWidthExtra = 60;}
            else if (width <= 3000) {thicknessAndWidthExtra = 85;}
            else if (width <= 3600) {thicknessAndWidthExtra = 110;}
            else {thicknessAndWidthExtra = 160;}
        }
        else if (thickness <= 119) {
            if (width <= 2050) {thicknessAndWidthExtra = 80;}
            else if (width <= 2450) {thicknessAndWidthExtra = 80;}
            else if (width <= 3000) {thicknessAndWidthExtra = 105;}
            else if (width <= 3600) {thicknessAndWidthExtra = 130;}
            else {thicknessAndWidthExtra = 180;}
        }
        else {
            if (width <= 2050) {thicknessAndWidthExtra = 100;}
            else if (width <= 2450) {thicknessAndWidthExtra = 100;}
            else if (width <= 3000) {thicknessAndWidthExtra = 125;}
            else if (width <= 3600) {thicknessAndWidthExtra = 150;}
            else {thicknessAndWidthExtra = 200;}
        }

        /// Length Extra
        if (thickness < 8) {
            if (length < 4001) {lengthExtra = 20;}
            else if (length <= 12000) { lengthExtra = 0;}
            else if (length <= 13600) { lengthExtra = 20;}
            else if (length <= 16000) { lengthExtra = 30;}
            else { lengthExtra = 40;}
        }
        else if (thickness <= 40) {
            if (length < 4001) {lengthExtra = 20;}
            else if (length <= 12000) { lengthExtra = 0;}
            else if (length <= 13600) { lengthExtra = 20;}
            else if (length <= 16000) { lengthExtra = 30;}
            else { lengthExtra = 40;}
        }
        else {
            if (length < 4001) {lengthExtra = 20;}
            else if (length <= 12000) { lengthExtra = 0;}
            else if (length <= 13600) { lengthExtra = 20;}
            else if (length <= 16000) { lengthExtra = 30;}
            else { lengthExtra = 40;}
        }
    }

    public void qualityExtraCalc() {

        switch (quality) {
            case "16MO3" -> qualityExtra = 175;
            case "A 537 CLASS 1" -> qualityExtra = 80;
            case "A283 GR. A/ASTM" -> qualityExtra = 11;
            case "A283 GR. B/ASTM" -> qualityExtra = 13;
            case "A283 GR. C/ASTM" -> qualityExtra = 15;
            case "A283 GR. D/ASTM" -> qualityExtra = 18;
            case "A285 GR. A/ASTM" -> qualityExtra = 48;
            case "A285 GR. B/ASTM" -> qualityExtra = 49;
            case "A285 GR. C/ASTM" -> qualityExtra = 61;
            case "A299 GRAD A" -> qualityExtra = 95;
            case "A36/ ASTM" -> qualityExtra = 20;
            case "A573M-450" -> qualityExtra = 50;
            case "A662/ASTMA662" -> qualityExtra = 180;
            case "ABS  A" -> qualityExtra = 5;
            case "ABS  AH 32" -> qualityExtra = 30;
            case "ABS  AH 36" -> qualityExtra = 35;
            case "ABS  B" -> qualityExtra = 30;
            case "ABS  D" -> qualityExtra = 40;
            case "ABS  DH 32" -> qualityExtra = 48;
            case "ABS  DH 36" -> qualityExtra = 55;
            case "ABS  E" -> qualityExtra = 60;
            case "ABS  EH 32" -> qualityExtra = 65;
            case "ABS  EH 36" -> qualityExtra = 75;
            case "API5L A" -> qualityExtra = 20;
            case "API5L B" -> qualityExtra = 40;
            case "ASTM A 285 GR.A" -> qualityExtra = 48;
            case "ASTM A 285 GR.B" -> qualityExtra = 49;
            case "ASTM A 285 GR.C" -> qualityExtra = 61;
            case "ASTM A 515 GR.55" -> qualityExtra = 51;
            case "ASTM A 515 GR.60" -> qualityExtra = 61;
            case "ASTM A 515 GR.65" -> qualityExtra = 70;
            case "ASTM A 515 GR.70" -> qualityExtra = 75;
            case "ASTM A 516 GR.55" -> qualityExtra = 60;
            case "ASTM A 516 GR.60" -> qualityExtra = 65;
            case "ASTM A 516 GR.65" -> qualityExtra = 75;
            case "ASTM A 516 GR.70" -> qualityExtra = 80;
            case "BV A" -> qualityExtra = 5;
            case "BV AH 32" -> qualityExtra = 30;
            case "BV AH 36" -> qualityExtra = 35;
            case "BV B" -> qualityExtra = 30;
            case "BV D" -> qualityExtra = 40;
            case "BV DH 32" -> qualityExtra = 48;
            case "BV DH 36" -> qualityExtra = 55;
            case "BV E" -> qualityExtra = 60;
            case "BV EH 32" -> qualityExtra = 65;
            case "BV EH 36" -> qualityExtra = 75;
            case "C45/OLC45" -> qualityExtra = 40;
            case "DNV / NVA" -> qualityExtra = 5;
            case "DNV / NVA 32" -> qualityExtra = 30;
            case "DNV / NVA 36" -> qualityExtra = 35;
            case "DNV / NVB" -> qualityExtra = 30;
            case "DNV / NVD" -> qualityExtra = 40;
            case "DNV / NVD 32" -> qualityExtra = 48;
            case "DNV / NVD 36" -> qualityExtra = 55;
            case "DNV / NVE" -> qualityExtra = 60;
            case "DNV / NVE 32" -> qualityExtra = 65;
            case "DNV / NVE 36" -> qualityExtra = 75;
            case "GL A" -> qualityExtra = 5;
            case "GL A 32" -> qualityExtra = 30;
            case "GL A 36" -> qualityExtra = 35;
            case "GL B" -> qualityExtra = 30;
            case "GL D" -> qualityExtra = 40;
            case "GL D 32" -> qualityExtra = 48;
            case "GL D 36" -> qualityExtra = 55;
            case "GL E" -> qualityExtra = 60;
            case "GL E 32" -> qualityExtra = 65;
            case "GL E 36" -> qualityExtra = 75;
            case "Gr B/L245" -> qualityExtra = 40;
            case "L415NB/MB" -> qualityExtra = 108;
            case "LRS A" -> qualityExtra = 5;
            case "LRS AH 32" -> qualityExtra = 30;
            case "LRS AH 36" -> qualityExtra = 35;
            case "LRS B" -> qualityExtra = 30;
            case "LRS D" -> qualityExtra = 40;
            case "LRS DH 32" -> qualityExtra = 48;
            case "LRS DH 36" -> qualityExtra = 55;
            case "LRS E" -> qualityExtra = 60;
            case "LRS EH 32" -> qualityExtra = 65;
            case "LRS EH 36" -> qualityExtra = 75;
            case "OL37EP" -> qualityExtra = 45;
            case "OL52EP" -> qualityExtra = 75;
            case "P235GH" -> qualityExtra = 30;
            case "P235S" -> qualityExtra = 48;
            case "P265GH" -> qualityExtra = 35;
            case "P265S" -> qualityExtra = 52;
            case "P275N" -> qualityExtra = 65;
            case "P275NH" -> qualityExtra = 70;
            case "P275NL1" -> qualityExtra = 75;
            case "P275NL2" -> qualityExtra = 85;
            case "P275SL" -> qualityExtra = 72;
            case "P295GH" -> qualityExtra = 55;
            case "P315NH" -> qualityExtra = 72;
            case "P315NL1" -> qualityExtra = 82;
            case "P355GH" -> qualityExtra = 65;
            case "P355N" -> qualityExtra = 75;
            case "P355NH" -> qualityExtra = 80;
            case "P355NL1" -> qualityExtra = 90;
            case "P355NL2" -> qualityExtra = 100;
            case "P380NH" -> qualityExtra = 120;
            case "P380NL1" -> qualityExtra = 130;
            case "P420NH" -> qualityExtra = 145;
            case "P420NL1" -> qualityExtra = 155;
            case "P460N" -> qualityExtra = 185;
            case "P460NH" -> qualityExtra = 200;
            case "P460NL1" -> qualityExtra = 210;
            case "P460NL2" -> qualityExtra = 220;
            case "RINA A" -> qualityExtra = 5;
            case "RINA AH 32" -> qualityExtra = 30;
            case "RINA AH 36" -> qualityExtra = 35;
            case "RINA B" -> qualityExtra = 30;
            case "RINA D" -> qualityExtra = 40;
            case "RINA DH 32" -> qualityExtra = 48;
            case "RINA DH 36" -> qualityExtra = 55;
            case "RINA E" -> qualityExtra = 60;
            case "RINA EH 32" -> qualityExtra = 65;
            case "RINA EH 36" -> qualityExtra = 75;
            case "S 235JRC+AR" -> qualityExtra = 10;
            case "S 355 J2C+N" -> qualityExtra = 40;
            case "S185+AR" -> qualityExtra = 0;
            case "S185+N" -> qualityExtra = 0;
            case "S235J2+AR" -> qualityExtra = 15;
            case "S235J2+N" -> qualityExtra = 15;
            case "S235J2W" -> qualityExtra = 80;
            case "S235JO+AR" -> qualityExtra = 5;
            case "S235JO+N" -> qualityExtra = 5;
            case "S235JOW" -> qualityExtra = 75;
            case "S235JR+AR" -> qualityExtra = 0;
            case "S235JR+N" -> qualityExtra = 0;
            case "S260NC" -> qualityExtra = 30;
            case "S275J2+AR" -> qualityExtra = 20;
            case "S275J2+N" -> qualityExtra = 20;
            case "S275JO+AR" -> qualityExtra = 15;
            case "S275JO+N" -> qualityExtra = 15;
            case "S275JR+AR" -> qualityExtra = 10;
            case "S275JR+N" -> qualityExtra = 10;
            case "S275M" -> qualityExtra = 35;
            case "S275ML" -> qualityExtra = 60;
            case "S275N" -> qualityExtra = 30;
            case "S275NL" -> qualityExtra = 55;
            case "S315MC" -> qualityExtra = 35;
            case "S315NC" -> qualityExtra = 40;
            case "S355J2+AR" -> qualityExtra = 30;
            case "S355J2+N" -> qualityExtra = 30;
            case "S355J2H" -> qualityExtra = 90;
            case "S355J2W+AR" -> qualityExtra = 100;
            case "S355J2W+N" -> qualityExtra = 100;
            case "S355J2WP+N" -> qualityExtra = 100;
            case "S355JO+AR" -> qualityExtra = 25;
            case "S355JO+N" -> qualityExtra = 25;
            case "S355JOC+N" -> qualityExtra = 35;
            case "S355JOW" -> qualityExtra = 100;
            case "S355JOWP" -> qualityExtra = 105;
            case "S355JR+AR" -> qualityExtra = 25;
            case "S355JR+N" -> qualityExtra = 25;
            case "S355K2+AR" -> qualityExtra = 55;
            case "S355K2+N" -> qualityExtra = 55;
            case "S355K2W+AR" -> qualityExtra = 115;
            case "S355K2W+N" -> qualityExtra = 115;
            case "S355M" -> qualityExtra = 60;
            case "S355MC" -> qualityExtra = 60;
            case "S355ML" -> qualityExtra = 75;
            case "S355N" -> qualityExtra = 50;
            case "S355NC" -> qualityExtra = 60;
            case "S355NL" -> qualityExtra = 75;
            case "S420M" -> qualityExtra = 105;
            case "S420MC" -> qualityExtra = 115;
            case "S420ML" -> qualityExtra = 130;
            case "S420N" -> qualityExtra = 90;
            case "S420NC" -> qualityExtra = 125;
            case "S420NL" -> qualityExtra = 110;
            case "S460M" -> qualityExtra = 160;
            case "S460MC" -> qualityExtra = 170;
            case "S460ML" -> qualityExtra = 180;
            case "S460N" -> qualityExtra = 150;
            case "S460NL" -> qualityExtra = 170;
            case "S460QL" -> qualityExtra = 190;
            case "S460QL1" -> qualityExtra = 220;
            case "S500MC" -> qualityExtra = 205;
            case "S500QL" -> qualityExtra = 300;
            case "S500QL1" -> qualityExtra = 335;
            case "S690QL" -> qualityExtra = 350;
            case "S690QL1" -> qualityExtra = 385;
            case "ST37.0" -> qualityExtra = 25;
            case "X42 / API5L" -> qualityExtra = 70;
            case "X46 / API5L" -> qualityExtra = 80;
            case "X52 / API5L " -> qualityExtra = 90;
            case "X60 / API5L " -> qualityExtra = 110;
            case "X65 / API5L " -> qualityExtra = 140;
            case "X70 / API5L " -> qualityExtra = 150;
            case "X65-1TPGL" -> qualityExtra = 103;
            case "X52-1TPGL" -> qualityExtra = 57;
            case "L415NBTPGL" -> qualityExtra = 108;
            case "B_TP/P235GHTP" -> qualityExtra = 28;
            case "BTP/P235GH/S235JR" -> qualityExtra = 28;
            case "X52-2M/X42-2M" -> qualityExtra = 57;
            case "X52M/X42M" -> qualityExtra = 57;
            case "L415M_TP" -> qualityExtra = 108;
            case "L415-1M_TP " -> qualityExtra = 108;
            case "ST3SP " -> qualityExtra = 0;
            case "BM_L245MTP " -> qualityExtra = 32;
            case "X42-2M TP/B-2M TP" -> qualityExtra = 57;
            case "15G2SF-52" -> qualityExtra = 108;
            case "X52M/L360M" -> qualityExtra = 57;
            case "X52N TP/S355J2H TP" -> qualityExtra = 57;
            case "BQC_TP" -> qualityExtra = 28;
            case "P235GH_TP" -> qualityExtra = 28;
            case "X42-3M TP/B-3M TP" -> qualityExtra = 57;
            case "B TP/ S 235JRH TP" -> qualityExtra = 28;
            case "BN_L245NTP" -> qualityExtra = 32;
            case "L235 TP" -> qualityExtra = 28;
            case "X52NTC_TP" -> qualityExtra = 57;
            case "X60N_TP" -> qualityExtra = 108;
            case "X42M TP/BM TP" -> qualityExtra = 34;
            case "17G1S" -> qualityExtra = 58;
            case "S355J2H-CL3_TP" -> qualityExtra = 90;
            case "X70M_TP  " -> qualityExtra = 216;
            case "A516_G60_TP" -> qualityExtra = 65;
            case "L245ME TP" -> qualityExtra = 72;
            case "L360ME_TP " -> qualityExtra = 58;
            case "BM_L245M_AMTP" -> qualityExtra = 32;
            case "X65M/L450M_TP " -> qualityExtra = 103;
            case "S355G2+N" -> qualityExtra = 110;
            case "S355G3+N" -> qualityExtra = 120;
            case "S355G7+M" -> qualityExtra = 130;
            case "S355G8+M" -> qualityExtra = 135;
            case "S355G9+M" -> qualityExtra = 140;
            case "S355G10+M" -> qualityExtra = 145;
            case "S235JOC+N" -> qualityExtra = 15;
            case "L415NE PSL2" -> qualityExtra = 108;
            default -> qualityExtra = Double.NaN;
        }

            // Galvanising Extra
            switch (galvanising) {
                case "Class 1" -> galvanisingExtra = 5;
                case "Class 3" -> galvanisingExtra = 0;
            }
    }

    public void usTestExtraCalc() {

        double sValue = 0;
        double eValue = 0;

        if (!usTest.equals("No")) {

            int middleIndex = usTest.indexOf("E");
            String s = usTest.substring(0, middleIndex);

            if (s.equals("S0")) {
                if (thickness <= 12) {
                    sValue = 3;
                } else if (thickness <= 25) {
                    sValue = 3;
                } else if (thickness <= 50) {
                    sValue = 8;
                } else if (thickness < 80) {
                    sValue = 8;
                } else {
                    sValue = 13;
                }
            } else if (s.equals("S1")) {
                if (thickness <= 12) {
                    sValue = 5;
                } else if (thickness <= 25) {
                    sValue = 5;
                } else if (thickness <= 50) {
                    sValue = 12;
                } else if (thickness < 80) {
                    sValue = 12;
                } else {
                    sValue = 15;
                }
            } else if (s.equals("S2")) {
                if (thickness <= 12) {
                    sValue = 15;
                } else if (thickness <= 25) {
                    sValue = 15;
                } else if (thickness <= 50) {
                    sValue = 16;
                } else if (thickness < 80) {
                    sValue = 16;
                } else {
                    sValue = 20;
                }
            } else if (s.equals("S3")) {
                if (thickness <= 12) {
                    sValue = 35;
                } else if (thickness <= 25) {
                    sValue = 38;
                } else if (thickness <= 50) {
                    sValue = 40;
                } else if (thickness < 80) {
                    sValue = 40;
                } else {
                    sValue = 45;
                }
            }
        } else {sValue = 0;}

        if(!usTest.equals("No")) {

            int middleIndex = usTest.indexOf("E");
            String e = usTest.substring(middleIndex);

            if (e.equals("E0")) {
                if (thickness <= 12) {
                    eValue = 3;
                } else if (thickness <= 25) {
                    eValue = 3;
                } else if (thickness <= 50) {
                    eValue = 8;
                } else if (thickness < 80) {
                    eValue = 8;
                } else {
                    eValue = 13;
                }
            } else if (e.equals("E1")) {
                if (thickness <= 12) {
                    eValue = 5;
                } else if (thickness <= 25) {
                    eValue = 5;
                } else if (thickness <= 50) {
                    eValue = 8;
                } else if (thickness < 80) {
                    eValue = 8;
                } else {
                    eValue = 12;
                }
            } else if (e.equals("E2")) {
                if (thickness <= 12) {
                    eValue = 15;
                } else if (thickness <= 25) {
                    eValue = 15;
                } else if (thickness <= 50) {
                    eValue = 16;
                } else if (thickness < 80) {
                    eValue = 20;
                } else {
                    eValue = 20;
                }
            } else if (e.equals("E3")) {
                if (thickness <= 12) {
                    eValue = 35;
                } else if (thickness <= 25) {
                    eValue = 38;
                } else if (thickness <= 50) {
                    eValue = 40;
                } else if (thickness < 80) {
                    eValue = 45;
                } else {
                    eValue = 45;
                }
            }
        } else {eValue = 0;}

        usTestExtra = sValue + eValue;

    }
        
    public void certificatesAndZTestExtraCalc() {

        switch (certificates) {
            case "Type 3.1  Qvadrupla Cert" -> certificatesExtra = 20;
            case "Type 3.1  Triple Cert" -> certificatesExtra = 10;
            case "Type 3.1 & Double Cert" -> certificatesExtra = 5;
            case "Type 3.2" -> certificatesExtra = 15;
            default -> certificatesExtra = 0;
        }

        switch (zTest) {
            case "Z15 (lot)" -> zTestExtra = 10;
            case "Z25 (lot)" -> zTestExtra = 20;
            case "Z35 (lot)" -> zTestExtra = 30;
            case "Z15 (mother plate)" -> zTestExtra = 20;
            case "Z25 (mother plate)" -> zTestExtra = 35;
            case "Z35 (mother plate)" -> zTestExtra = 50;
        }
    }

    public void nor_tuv_dbs_sep_tTExtraCalc() {

        if (normalizing.equals("Yes")) {
            normalizingExtra = 30;
        } else {normalizingExtra = 0;}

        if (tuv.equals("Yes")) {
            tuvExtra = 15;
        } else {tuvExtra = 0;}

        if (dbs.equals("Yes")) {
            dbsExtra = 30;
        } else {dbsExtra = 0;}

        if (sep.equals("Yes")) {
            sepExtra = 30;
        } else {sepExtra = 0;}

        if (thicknessTolerances.equals("Class C")) {
            thicknessTolerancesExtra = 30;
        } else {thicknessTolerancesExtra = 0;}
    }

    public void s_c_tensile_ExtraCalc() {

        switch (sulphur) {
            case "As per standard", "0.012% < S ≤ 0.015%" -> sulphurExtra = 0;
            case "0.010% < S ≤ 0.012%" -> sulphurExtra = 11;
            case "0.008% < S ≤ 0.010%" -> sulphurExtra = 18;
            case "0.005% < S ≤ 0.008%" -> sulphurExtra = 25;
            case "0.003% < S ≤ 0.005%" -> sulphurExtra = 30;
            case "S ≤ 0.003%" -> sulphurExtra = 45;
        }

        switch (carbon) {
            case "As per standard" -> carbonExtra = 0;
            case "For 0.01% reduction" -> carbonExtra = 6;
            case "For 0.02% reduction" -> carbonExtra = 12;
            case "For 0.03% reduction" -> carbonExtra = 18;
            case "For 0.04% reduction" -> carbonExtra = 24;
            case "For 0.05% reduction" -> carbonExtra = 30;
            case "For 0.06% reduction" -> carbonExtra = 36;
            case "For 0.07% reduction" -> carbonExtra = 42;
            case "For 0.08% reduction" -> carbonExtra = 48;
            case "For 0.09% reduction" -> carbonExtra = 54;
            case "For 0.10% reduction" -> carbonExtra = 60;
        }

        switch (tensileTest) {
            case "Tensile test (lot)" -> tensileTestExtra = 1;
            case "Tensile test (single plate)" -> tensileTestExtra = 10;

        }

        switch (charpyTest) {
            case "Charpy impact test (lot)" -> charpyTestExtra = 1;
            case "Charpy impact test (single plate)" -> charpyTestExtra = 10;
        }

        switch (cev) {
            case "As per standard" -> cevExtra = 0;
            case "For 0.01% reduction" -> carbonExtra = 6;
            case "For 0.02% reduction" -> carbonExtra = 12;
            case "For 0.03% reduction" -> carbonExtra = 18;
            case "For 0.04% reduction" -> carbonExtra = 24;
            case "For 0.05% reduction" -> carbonExtra = 30;
            case "For 0.06% reduction" -> carbonExtra = 36;
            case "For 0.07% reduction" -> carbonExtra = 42;
            case "For 0.08% reduction" -> carbonExtra = 48;
            case "For 0.09% reduction" -> carbonExtra = 54;
            case "For 0.10% reduction" -> carbonExtra = 60;
        }

        if (weightPerSheet > 11.4) {
            plateUnitWeightExtra = 20;
        }
    }

    public void priceAndValueCalc() {

        effectiveDAPPrice = pivotItemPrice + thicknessAndWidthExtra + lengthExtra + qualityExtra + galvanisingExtra +
                usTestExtra + certificatesExtra + zTestExtra + normalizingExtra + tuvExtra + dbsExtra + sepExtra +
                thicknessTolerancesExtra + sulphurExtra + carbonExtra + tensileTestExtra + charpyTestExtra + cevExtra+
                plateUnitWeightExtra;
        effectiveFCAPrice = effectiveDAPPrice - freightCost;
        value = effectiveDAPPrice * qty;
        value = (double) Math.round(value * 100) / 100;
        contribution = effectiveFCAPrice - variableCost;
        contribution = (double) Math.round(contribution * 1000) / 1000;

    }


    @Override
    public String toString() {
        return "T: %d W: %d L: %d P: %d Qty: %s?".formatted(thickness, width, length, pieces, qty);
    }

    ////// Getter and Setters

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getWeightPerSheet() {
        return weightPerSheet;
    }

    public void setWeightPerSheet(double weightPerSheet) {
        this.weightPerSheet = weightPerSheet;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getGalvanising() {
        return galvanising;
    }

    public void setGalvanising(String galvanising) {
        this.galvanising = galvanising;
    }

    public String getUsTest() {
        return usTest;
    }

    public void setUsTest(String usTest) {
        this.usTest = usTest;
    }

    public String getCertificates() {
        return certificates;
    }

    public void setCertificates(String certificates) {
        this.certificates = certificates;
    }

    public String getZTest() {
        return zTest;
    }

    public void setZTest(String zTest) {
        this.zTest = zTest;
    }

    public String getNormalizing() {
        return normalizing;
    }

    public void setNormalizing(String normalizing) {
        this.normalizing = normalizing;
    }

    public String getTuv() {
        return tuv;
    }

    public void setTuv(String tuv) {
        this.tuv = tuv;
    }

    public String getDbs() {
        return dbs;
    }

    public void setDbs(String dbs) {
        this.dbs = dbs;
    }

    public String getSep() {
        return sep;
    }

    public void setSep(String sep) {
        this.sep = sep;
    }

    public String getThicknessTolerances() {
        return thicknessTolerances;
    }

    public void setThicknessTolerances(String thicknessTolerances) {
        this.thicknessTolerances = thicknessTolerances;
    }

    public String getSulphur() {
        return sulphur;
    }

    public void setSulphur(String sulphur) {
        this.sulphur = sulphur;
    }

    public String getCarbon() {
        return carbon;
    }

    public void setCarbon(String carbon) {
        this.carbon = carbon;
    }

    public String getTensileTest() {
        return tensileTest;
    }

    public void setTensileTest(String tensileTest) {
        this.tensileTest = tensileTest;
    }

    public String getCharpyTest() {
        return charpyTest;
    }

    public void setCharpyTest(String charpyTest) {
        this.charpyTest = charpyTest;
    }

    public String getCev() {
        return cev;
    }

    public void setCev(String cev) {
        this.cev = cev;
    }

    public double getExwPivot() {
        return exwPivot;
    }

    public void setExwPivot(double exwPivot) {
        this.exwPivot = exwPivot;
    }

    public double getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(double freightCost) {
        this.freightCost = freightCost;
    }

    public double getPivotItemPrice() {
        return pivotItemPrice;
    }

    public void setPivotItemPrice(double pivotItemPrice) {
        this.pivotItemPrice = pivotItemPrice;
    }

    public double getThicknessAndWidthExtra() {
        return thicknessAndWidthExtra;
    }

    public void setThicknessAndWidthExtra(double thicknessAndWidthExtra) {
        this.thicknessAndWidthExtra = thicknessAndWidthExtra;
    }

    public double getLengthExtra() {
        return lengthExtra;
    }

    public void setLengthExtra(double lengthExtra) {
        this.lengthExtra = lengthExtra;
    }

    public double getQualityExtra() {
        return qualityExtra;
    }

    public void setQualityExtra(double qualityExtra) {
        this.qualityExtra = qualityExtra;
    }

    public double getGalvanisingExtra() {
        return galvanisingExtra;
    }

    public void setGalvanisingExtra(double galvanisingExtra) {
        this.galvanisingExtra = galvanisingExtra;
    }

    public double getUsTestExtra() {
        return usTestExtra;
    }

    public void setUsTestExtra(double usTestExtra) {
        this.usTestExtra = usTestExtra;
    }

    public double getCertificatesExtra() {
        return certificatesExtra;
    }

    public void setCertificatesExtra(double certificatesExtra) {
        this.certificatesExtra = certificatesExtra;
    }

    public double getZTestExtra() {
        return zTestExtra;
    }

    public void setZTestExtra(double zTestExtra) {
        this.zTestExtra = zTestExtra;
    }

    public double getNormalizingExtra() {
        return normalizingExtra;
    }

    public void setNormalizingExtra(double normalizingExtra) {
        this.normalizingExtra = normalizingExtra;
    }

    public double getTuvExtra() {
        return tuvExtra;
    }

    public void setTuvExtra(double tuvExtra) {
        this.tuvExtra = tuvExtra;
    }

    public double getDbsExtra() {
        return dbsExtra;
    }

    public void setDbsExtra(double dbsExtra) {
        this.dbsExtra = dbsExtra;
    }

    public double getSepExtra() {
        return sepExtra;
    }

    public void setSepExtra(double sepExtra) {
        this.sepExtra = sepExtra;
    }

    public double getThicknessTolerancesExtra() {
        return thicknessTolerancesExtra;
    }

    public void setThicknessTolerancesExtra(double thicknessTolerancesExtra) {
        this.thicknessTolerancesExtra = thicknessTolerancesExtra;
    }

    public double getSulphurExtra() {
        return sulphurExtra;
    }

    public void setSulphurExtra(double sulphurExtra) {
        this.sulphurExtra = sulphurExtra;
    }

    public double getCarbonExtra() {
        return carbonExtra;
    }

    public void setCarbonExtra(double carbonExtra) {
        this.carbonExtra = carbonExtra;
    }

    public double getTensileTestExtra() {
        return tensileTestExtra;
    }

    public void setTensileTestExtra(double tensileTestExtra) {
        this.tensileTestExtra = tensileTestExtra;
    }

    public double getCharpyTestExtra() {
        return charpyTestExtra;
    }

    public void setCharpyTestExtra(double charpyTestExtra) {
        this.charpyTestExtra = charpyTestExtra;
    }

    public double getCevExtra() {
        return cevExtra;
    }

    public void setCevExtra(double cevExtra) {
        this.cevExtra = cevExtra;
    }

    public double getPlateUnitWeightExtra() {
        return plateUnitWeightExtra;
    }

    public void setPlateUnitWeightExtra(double plateUnitWeightExtra) {
        this.plateUnitWeightExtra = plateUnitWeightExtra;
    }

    public double getEffectiveFCAPrice() {
        return effectiveFCAPrice;
    }

    public void setEffectiveFCAPrice(double effectiveFCAPrice) {
        this.effectiveFCAPrice = effectiveFCAPrice;
    }

    public double getEffectiveDAPPrice() {
        return effectiveDAPPrice;
    }

    public void setEffectiveDAPPrice(double effectiveDAPPrice) {
        this.effectiveDAPPrice = effectiveDAPPrice;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getVariableCost() {
        return variableCost;
    }

    public void setVariableCost(double variableCost) {
        this.variableCost = variableCost;
    }

    public double getContribution() {
        return contribution;
    }

    public void setContribution(double contribution) {
        this.contribution = contribution;
    }
}
