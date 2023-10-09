package dev.vio.pricematrix;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddWController {

    @FXML
    private TextField thickInput;
    @FXML
    private TextField widthInput;
    @FXML
    private TextField lengthInput;
    @FXML
    private TextField piecesInput;
    @FXML
    private TextField vcInput;
    @FXML
    private TextField pivotItemPriceInput;
    @FXML
    private TextField freightInput;
    @FXML
    private ComboBox<String> qualityChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> galvanisingChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> usTestSChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> usTestEChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> certificatesChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> zTestChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> normalisingChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> tuvChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> dbsChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> sepChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> thickToleranceChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> sulphurChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> carbonChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> tensileChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> charpyChoise = new ComboBox<>();
    @FXML
    private ComboBox<String> cevChoise = new ComboBox<>();


    public void initialize() {

        ObservableList<String> qualityOptions = FXCollections.observableArrayList(
                "16MO3","A 537 CLASS 1","A 537 CLASS 2","A283 GR. A/ASTM","A283 GR. B/ASTM","A283 GR. C/ASTM","A283 GR. D/ASTM","A285 GR. A/ASTM","A285 GR. B/ASTM",	"A285 GR. C/ASTM",	"A299 GRAD A",	"A36/ ASTM",	"A573M-450",	"A662/ASTMA662",	"ABS  A",	"ABS  AH 32",	"ABS  AH 36",	"ABS  B",	"ABS  D",	"ABS  DH 32",	"ABS  DH 36",	"ABS  E",	"ABS  EH 32",	"ABS  EH 36",	"API5L A",	"API5L B",	"ASTM A",	"ASTM A 285 GR.A",	"ASTM A 285 GR.B",	"ASTM A 285 GR.C",	"ASTM A 515 GR.55",	"ASTM A 515 GR.60",	"ASTM A 515 GR.65",	"ASTM A 515 GR.70",	"ASTM A 516 GR.55",	"ASTM A 516 GR.60",	"ASTM A 516 GR.65",	"ASTM A 516 GR.70",	"ASTM AH 32",	"ASTM AH 36",	"ASTM AH 36",	"ASTM B",	"ASTM D",	"ASTM DH 32",	"ASTM DH 36",	"ASTM E",	"ASTM EH 32",	"ASTM EH 36",	"BV A",	"BV AH 32",	"BV AH 36",	"BV B",	"BV D",	"BV DH 32",	"BV DH 36",	"BV E",	"BV EH 32",	"BV EH 36",	"C45/OLC45",	"DNV / NVA",	"DNV / NVA 32",	"DNV / NVA 36",	"DNV / NVB",	"DNV / NVD",	"DNV / NVD 32",	"DNV / NVD 36",	"DNV / NVE",	"DNV / NVE 32",	"DNV / NVE 36",	"E295",	"GL A",	"GL A 32",	"GL A 36",	"GL B",	"GL D",	"GL D 32",	"GL D 36",	"GL E",	"GL E 32",	"GL E 36",	"Gr B/L245",	"K410",	"K460",	"K510",	"L245NB",	"L285N",	"L290NB/MB",	"L320",	"L360NB/MB",	"L415NB/MB",	"L450MB",	"L485MB  ",	"LRS A",	"LRS AH 32",	"LRS AH 36",	"LRS B",	"LRS D",	"LRS DH 32",	"LRS DH 36",	"LRS E",	"LRS EH 32",	"LRS EH 36",	"OL 52 A",	"OL37EP",	"OL52EP",	"P235GH",	"P235S",	"P235TR1",	"P265GH",	"P265S",	"P275N",	"P275NH",	"P275NL1",	"P275NL2",	"P275SL",	"P295GH",	"P315N",	"P315NH",	"P315NL1",	"P355GH",	"P355N",	"P355NH",	"P355NL1",	"P355NL2",	"P380NH",	"P380NL1",	"P420NH",	"P420NL1",	"P460N",	"P460NH",	"P460NL1",	"P460NL2",	"R 430-4a / STAS",	"R 430-4b / STAS",	"R 430-6a / STAS",	"R 430-6a / STAS",	"R 510-4a / STAS",	"R 510-4b / STAS",	"R 510-7a / STAS",	"R 510-7b / STAS",	"RINA A",	"RINA AH 32",	"RINA AH 36",	"RINA B",	"RINA D",	"RINA DH 32",	"RINA DH 36",	"RINA E",	"RINA EH 32",	"RINA EH 36",	"RS A",	"RS A 32",	"RS A 36",	"RS B",	"RS D",	"RS D 32",	"RS D 36",	"RS E",	"RS E 32",	"RS E 36",	"S 235JRC+AR",	"S 355 J2C+N",	"S185+AR",	"S185+N",	"S235J2+AR",	"S235J2+N",	"S235J2W",	"S235JO+AR",	"S235JO+N",	"S235JOW",	"S235JR+AR",	"S235JR+N",	"S255N",	"S255NL",	"S255NL1",	"S260NC",	"S275J2+AR",	"S275J2+N",	"S275JO+AR",	"S275JO+N",	"S275JR+AR",	"S275JR+N",	"S275K2+AR",	"S275K2+N",	"S275M",	"S275ML",	"S275N",	"S275NL",	"S315MC",	"S315NC",	"S315NL1",	"S355J2+AR",	"S355J2+N",	"S355J2G1W",	"S355J2G2W",	"S355J2H",	"S355J2W+AR",	"S355J2W+N",	"S355J2WP+N",	"S355JO+AR",	"S355JO+N",	"S355JOC+N",	"S355JOW",	"S355JOWP",	"S355JR+AR",	"S355JR+N",	"S355K2+AR",	"S355K2+N",	"S355K2G1W",	"S355K2G2W",	"S355K2G3",	"S355K2G4",	"S355K2W+AR",	"S355K2W+N",	"S355M",	"S355MC",	"S355ML",	"S355N",	"S355NC",	"S355NL",	"S380N",	"S380NL",	"S380NL1",	"S420M",	"S420MC",	"S420ML",	"S420N",	"S420NC",	"S420NL",	"S420NL1",	"S460M",	"S460MC",	"S460ML",	"S460N",	"S460NL",	"S460QL",	"S460QL1",	"S500MC",	"S500QL",	"S500QL1",	"S690QL",	"S690QL1",	"ST37.0",	"X42 / API5L",	"X46 / API5L",	"X52 / API5L ",	"X56 / API5L ",	"X60 / API5L ",	"X65 / API5L ",	"X70 / API5L ",	"X65-1TPGL",	"X52-1TPGL",	"L415NBTPGL",	"B_TP/P235GHTP",	"BTP/P235GH/S235JR",	"X52-2M/X42-2M",	"X52M/X42M",	"L415M_TP",	"L415-1M_TP ",	"ST3SP ",	"BM_L245MTP ",	"X42-2M TP/B-2M TP",	"15G2SF-52",	"X52M/L360M",	"X52N TP/S355J2H TP",	"BQC_TP",	"P235GH_TP",	"X42-3M TP/B-3M TP",	"B TP/ S 235JRH TP",	"BN_L245NTP",	"L235 TP",	"X52NTC_TP",	"X60N_TP",	"X42M TP/BM TP",	"17G1S",	"S355J2H-CL3_TP",	"X70M_TP  ",	"A516_G60_TP",	"L245ME TP",	"L360ME_TP ",	"BM_L245M_AMTP",	"X65M/L450M_TP ",	"S355G2+N",	"S355G3+N",	"S355G7+M",	"S355G8+M",	"S355G9+M",	"S355G10+M",	"S235JOC+N",	"L415NE PSL2");
        qualityChoise.setItems(qualityOptions);

        ObservableList<String> galvanisingOptions = FXCollections.observableArrayList(
                "Class 1", "Class 3");
        galvanisingChoise.setItems(galvanisingOptions);

        ObservableList<String> usTestSOptions = FXCollections.observableArrayList(
                "S0", "S1", "S2", "S3");
        usTestSChoise.setItems(usTestSOptions);

        ObservableList<String> usTestEOptions = FXCollections.observableArrayList(
                "E0", "E1", "E2", "E3");
        usTestEChoise.setItems(usTestEOptions);

        ObservableList<String> certificatesOptions = FXCollections.observableArrayList(
                "Type 2.1","Type 2.2","Type 3.1","Type 3.1  Qvadrupla Cert","Type 3.1  Triple Cert","Type 3.1 & Double Cert","Type 3.2");
        certificatesChoise.setItems(certificatesOptions);

        ObservableList<String> zTestOptions = FXCollections.observableArrayList("Z15 (lot)","Z25 (lot)","Z35 (lot)","Z15 (mother plate)","Z25 (mother plate)","Z35 (mother plate)");
        zTestChoise.setItems(zTestOptions);

        ObservableList<String> normalizingOptions = FXCollections.observableArrayList("Yes","No");
        normalisingChoise.setItems(normalizingOptions);

        ObservableList<String> tuvOptions = FXCollections.observableArrayList("Yes","No");
        tuvChoise.setItems(tuvOptions);

        ObservableList<String> dbsOptions = FXCollections.observableArrayList("Yes","No");
        dbsChoise.setItems(dbsOptions);

        ObservableList<String> sepOptions = FXCollections.observableArrayList("Yes","No");
        sepChoise.setItems(sepOptions);

        ObservableList<String> thickToleranceOptions = FXCollections.observableArrayList("Class C");
        thickToleranceChoise.setItems(thickToleranceOptions);

        ObservableList<String> sulphurOptions = FXCollections.observableArrayList(
                "0.012% < S ≤ 0.015% ", "0.010% < S ≤ 0.012%", "0.008% < S ≤ 0.010%", "0.005% < S ≤ 0.008%", "0.003% < S ≤ 0.005%", "S ≤ 0.003% ");
        sulphurChoise.setItems(sulphurOptions);

        ObservableList<String> carbonOptions = FXCollections.observableArrayList(
                "For 0.01% reduction","For 0.02% reduction","For 0.03% reduction","For 0.04% reduction","For 0.05% reduction","For 0.06% reduction",
                "For 0.07% reduction","For 0.08% reduction","For 0.09% reduction","For 0.10% reduction");
        carbonChoise.setItems(carbonOptions);

        ObservableList<String> tensileOptions = FXCollections.observableArrayList(
                "Tensile test (lot)","Tensile test (single plate)");
        tensileChoise.setItems(tensileOptions);

        ObservableList<String> charpyOptions = FXCollections.observableArrayList(
                "Charpy impact test (lot)","Charpy impact test (single plate)");
        charpyChoise.setItems(charpyOptions);

        ObservableList<String> cevOptions = FXCollections.observableArrayList(
                "For 0.01% reduction","For 0.02% reduction","For 0.03% reduction","For 0.04% reduction","For 0.05% reduction","For 0.06% reduction",
                "For 0.07% reduction","For 0.08% reduction","For 0.09% reduction","For 0.10% reduction");
        cevChoise.setItems(cevOptions);

    }


    public HeavyPlate itemsProcessed() {

        int thickness = thicknessValidator(thickInput.getText());
        int width = widthValidator(widthInput.getText());
        int length = lengthValidator(lengthInput.getText());
        int pieces = piecesValidator(piecesInput.getText());
        String quality = qualityChoise.getValue() == null ? "No quality selected" : qualityChoise.getValue();
        String galvanising = galvanisingChoise.getValue() == null ? "No" : galvanisingChoise.getValue();
        String usTestS = usTestSChoise.getValue() == null ? "No" : usTestSChoise.getValue();
        String usTestE = usTestEChoise.getValue() == null ? "No" : usTestEChoise.getValue();
        String usTest = (usTestS + usTestE).equals("NoNo") ? "No" : usTestS + usTestE;
        String certificates = certificatesChoise.getValue() == null ? "No" : certificatesChoise.getValue();
        String zTest = zTestChoise.getValue() == null ? "No" : zTestChoise.getValue();
        String normalizing = normalisingChoise.getValue() == null ? "No" : normalisingChoise.getValue();
        String tuv = tuvChoise.getValue() == null ? "No" : tuvChoise.getValue();
        String dbs = dbsChoise.getValue() == null ? "No" : dbsChoise.getValue();
        String sep = sepChoise.getValue() == null ? "No" : sepChoise.getValue();
        String thicknessTolerances = thickToleranceChoise.getValue() == null ? "No" : thickToleranceChoise.getValue();
        String sulphur = sulphurChoise.getValue() == null ? "No" : sulphurChoise.getValue();
        String carbon = carbonChoise.getValue() == null ? "No" : carbonChoise.getValue();
        String tensileTest = tensileChoise.getValue() == null ? "No" : tensileChoise.getValue();
        String charpyTest = charpyChoise.getValue() == null ? "No" : charpyChoise.getValue();
        String cev = cevChoise.getValue() == null ? "No" : cevChoise.getValue();
        double freightCost = freightValidator(freightInput.getText());
        double pivotItemPrice = pivotItemPriceValidator(pivotItemPriceInput.getText());
        double variableCost = vcValidator(vcInput.getText());

        return new HeavyPlate(thickness, width, length, pieces, quality, galvanising,usTest, certificates, zTest, normalizing, tuv, dbs, sep, thicknessTolerances, sulphur,
                carbon, tensileTest, charpyTest, cev, freightCost, pivotItemPrice, variableCost);
    }

    public Integer thicknessValidator(String value) {

        try {
            int thick = Integer.parseInt(thickInput.getText());
            if(thick >= 0 && thick <= 130) {
                return thick;
            } else {
                return 0;
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect Input: Thickness");
            return -1;
        }
    }

    public Integer widthValidator(String value) {

        try {
            int width = Integer.parseInt(widthInput.getText());
            if(width >= 0 && width <= 3600) {
                return width;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect Input: Width");

            return -1;
        }
    }

    public Integer lengthValidator(String value) {

        try {
            int length = Integer.parseInt(lengthInput.getText());
            if(length >= 0 && length <= 16000) {
                return length;
            } else {
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect Input: Length");

            return -1;
        }
    }

    public Integer piecesValidator(String value) {

        try {
            int pieces = Integer.parseInt(piecesInput.getText());
            return Math.max(pieces, 0);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public Double freightValidator(String value) {

        try {
            double freight = Double.parseDouble(freightInput.getText());
            return Math.max(freight, 0);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public Double pivotItemPriceValidator(String value) {

        try {
            double pip = Double.parseDouble(pivotItemPriceInput.getText());
            return Math.max(pip, 0);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public Double vcValidator(String value) {

        try {
            double vc = Double.parseDouble(vcInput.getText());
            return Math.max(vc, 0);
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public void populateFields(HeavyPlate item) {

        thickInput.setText(String.valueOf(item.getThickness()));
        widthInput.setText(String.valueOf(item.getWidth()));
        lengthInput.setText(String.valueOf(item.getLength()));
        piecesInput.setText(String.valueOf(item.getPieces()));
        vcInput.setText(String.valueOf(item.getVariableCost()));
        pivotItemPriceInput.setText(String.valueOf(item.getPivotItemPrice()));
        freightInput.setText(String.valueOf(item.getFreightCost()));
        qualityChoise.setValue(item.getQuality());
        galvanisingChoise.setValue(item.getGalvanising());
        if (item.getUsTest().equals("No")) {
            usTestSChoise.setValue("No");
            usTestEChoise.setValue("No");
        } else {
            int middleIndex = item.getUsTest().indexOf("E");
            String s = item.getUsTest().substring(0, middleIndex);
            String e = item.getUsTest().substring(middleIndex);
            usTestSChoise.setValue(s);
            usTestEChoise.setValue(e);
        }
        certificatesChoise.setValue(item.getCertificates());
        zTestChoise.setValue(item.getZTest());
        normalisingChoise.setValue(item.getNormalizing());
        tuvChoise.setValue(item.getTuv());
        dbsChoise.setValue(item.getDbs());
        sepChoise.setValue(item.getSep());
        thickToleranceChoise.setValue(item.getThicknessTolerances());
        sulphurChoise.setValue(item.getSulphur());
        carbonChoise.setValue(item.getSulphur());
        tensileChoise.setValue(item.getTensileTest());
        charpyChoise.setValue(item.getCharpyTest());
        cevChoise.setValue(item.getCev());

    }

    public void updateItem(HeavyPlate item) {

        String thickness = thickInput.getText().trim();
        item.setThickness(thicknessValidator(thickness));
        String width = widthInput.getText().trim();
        item.setWidth(widthValidator(width));
        String length = lengthInput.getText().trim();
        item.setLength(lengthValidator(length));
        String pieces = piecesInput.getText().trim();
        item.setPieces(piecesValidator(pieces));
        String vc = vcInput.getText().trim();
        item.setVariableCost(vcValidator(vc));
        String pivotItemPrice = pivotItemPriceInput.getText().trim();
        item.setPivotItemPrice(pivotItemPriceValidator(pivotItemPrice));
        String freight = freightInput.getText().trim();
        item.setFreightCost(freightValidator(freight));
        String quality = qualityChoise.getValue();
        item.setQuality(quality);
        String galva = galvanisingChoise.getValue();
        item.setGalvanising(galva);
        String s = usTestSChoise.getValue();
        String e = usTestEChoise.getValue();
        if (s.equals("No") && e.equals("No")) {
            item.setUsTest("No");
        } else {
            item.setUsTest(s + e);
        }
        String certificates = certificatesChoise.getValue();
        item.setCertificates(certificates);
        String zTest = zTestChoise.getValue();
        item.setZTest(zTest);
        String norma = normalisingChoise.getValue();
        item.setNormalizing(norma);
        String tuv = tuvChoise.getValue();
        item.setTuv(tuv);
        String dbs = dbsChoise.getValue();
        item.setDbs(dbs);
        String sep = sepChoise.getValue();
        item.setSep(sep);
        String thickTol = thickToleranceChoise.getValue();
        item.setThicknessTolerances(thickTol);
        String sulphur = sulphurChoise.getValue();
        item.setSulphur(sulphur);
        String carbon = carbonChoise.getValue();
        item.setCarbon(carbon);
        String tensile = tensileChoise.getValue();
        item.setTensileTest(tensile);
        String charpy = charpyChoise.getValue();
        item.setCharpyTest(charpy);
        String cev = cevChoise.getValue();
        item.setCev(cev);

        item.weightPerSheetCalc();
        item.qtyCalc();
        item.exwPivotCalc();
        item.t_w_lExtraCalc();
        item.qualityExtraCalc();
        item.usTestExtraCalc();
        item.certificatesAndZTestExtraCalc();
        item.nor_tuv_dbs_sep_tTExtraCalc();
        item.s_c_tensile_ExtraCalc();
        item.priceAndValueCalc();

    }
}
