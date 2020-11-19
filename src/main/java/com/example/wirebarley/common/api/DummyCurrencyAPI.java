package com.example.wirebarley.common.api;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Component;

@Component(value = "dummyCurrencyAPI")
public class DummyCurrencyAPI extends DummyAPI<Double> {

    public DummyCurrencyAPI() {
        super("{\"success\":true,\"terms\":\"https:\\/\\/currencylayer.com\\/terms\",\"privacy\":\"https:\\/\\/currencylayer.com\\/privacy\",\"timestamp\":1605631265,\"source\":\"USD\",\"quotes\":{\"USDAED\":3.672993,\"USDAFN\":76.999462,\"USDALL\":104.450542,\"USDAMD\":497.380192,\"USDANG\":1.795407,\"USDAOA\":666.071993,\"USDARS\":80.025395,\"USDAUD\":1.369816,\"USDAWG\":1.8,\"USDAZN\":1.694464,\"USDBAM\":1.647001,\"USDBBD\":2.01952,\"USDBDT\":84.813561,\"USDBGN\":1.64639,\"USDBHD\":0.377036,\"USDBIF\":1943,\"USDBMD\":1,\"USDBND\":1.343304,\"USDBOB\":6.906494,\"USDBRL\":5.354203,\"USDBSD\":1.000244,\"USDBTC\":5.7240134e-5,\"USDBTN\":74.50485,\"USDBWP\":11.088992,\"USDBYN\":2.558378,\"USDBYR\":19600,\"USDBZD\":2.016134,\"USDCAD\":1.309625,\"USDCDF\":1964.999933,\"USDCHF\":0.910889,\"USDCLF\":0.02771,\"USDCLP\":764.600773,\"USDCNY\":6.5566,\"USDCOP\":3642.88,\"USDCRC\":612.121161,\"USDCUC\":1,\"USDCUP\":26.5,\"USDCVE\":93.311671,\"USDCZK\":22.327017,\"USDDJF\":178.060159,\"USDDKK\":6.27761,\"USDDOP\":56.469896,\"USDDZD\":128.445323,\"USDEGP\":15.631012,\"USDERN\":14.999578,\"USDETB\":37.800595,\"USDEUR\":0.842945,\"USDFJD\":2.103749,\"USDFKP\":0.754881,\"USDGBP\":0.754885,\"USDGEL\":3.31015,\"USDGGP\":0.754881,\"USDGHS\":5.844952,\"USDGIP\":0.754881,\"USDGMD\":51.769625,\"USDGNF\":9805.000122,\"USDGTQ\":7.784206,\"USDGYD\":209.101397,\"USDHKD\":7.75223,\"USDHNL\":24.320491,\"USDHRK\":6.3769,\"USDHTG\":63.963858,\"USDHUF\":304.704949,\"USDIDR\":14093.1,\"USDILS\":3.36845,\"USDIMP\":0.754881,\"USDINR\":74.43305,\"USDIQD\":1190,\"USDIRR\":42104.999718,\"USDISK\":136.130175,\"USDJEP\":0.754881,\"USDJMD\":147.531431,\"USDJOD\":0.709052,\"USDJPY\":104.208971,\"USDKES\":109.250325,\"USDKGS\":84.79797,\"USDKHR\":4059.99948,\"USDKMF\":414.999857,\"USDKPW\":900.05194,\"USDKRW\":1105.510487,\"USDKWD\":0.305796,\"USDKYD\":0.833495,\"USDKZT\":429.18014,\"USDLAK\":9274.999992,\"USDLBP\":1516.99998,\"USDLKR\":185.240585,\"USDLRD\":155.999802,\"USDLSL\":15.430049,\"USDLTL\":2.95274,\"USDLVL\":0.60489,\"USDLYD\":1.355018,\"USDMAD\":9.121502,\"USDMDL\":17.123898,\"USDMGA\":3974.999708,\"USDMKD\":51.885442,\"USDMMK\":1299.284475,\"USDMNT\":2829.987586,\"USDMOP\":7.987268,\"USDMRO\":357.000515,\"USDMUR\":39.930447,\"USDMVR\":15.398121,\"USDMWK\":757.499783,\"USDMXN\":20.326199,\"USDMYR\":4.104499,\"USDMZN\":73.739784,\"USDNAD\":15.430155,\"USDNGN\":380.999617,\"USDNIO\":34.819751,\"USDNOK\":9.06902,\"USDNPR\":119.208098,\"USDNZD\":1.45098,\"USDOMR\":0.384988,\"USDPAB\":1.000244,\"USDPEN\":3.648501,\"USDPGK\":3.507501,\"USDPHP\":48.240498,\"USDPKR\":158.200322,\"USDPLN\":3.785097,\"USDPYG\":7031.207895,\"USDQAR\":3.640993,\"USDRON\":4.106603,\"USDRSD\":99.085043,\"USDRUB\":76.327096,\"USDRWF\":985,\"USDSAR\":3.750606,\"USDSBD\":8.10133,\"USDSCR\":20.574987,\"USDSDG\":55.295565,\"USDSEK\":8.63084,\"USDSGD\":1.342898,\"USDSHP\":0.754881,\"USDSLL\":9984.999773,\"USDSOS\":580.99972,\"USDSRD\":14.153979,\"USDSTD\":21031.906016,\"USDSVC\":8.751853,\"USDSYP\":512.947614,\"USDSZL\":15.429667,\"USDTHB\":30.1895,\"USDTJS\":11.329999,\"USDTMT\":3.5,\"USDTND\":2.744502,\"USDTOP\":2.29575,\"USDTRY\":7.6992,\"USDTTD\":6.796069,\"USDTWD\":28.519201,\"USDTZS\":2318.999649,\"USDUAH\":28.128858,\"USDUGX\":3700.821881,\"USDUSD\":1,\"USDUYU\":42.984539,\"USDUZS\":10389.999704,\"USDVEF\":9.987496,\"USDVND\":23164,\"USDVUV\":111.846414,\"USDWST\":2.579218,\"USDXAF\":552.356934,\"USDXAG\":0.040691,\"USDXAU\":0.00053,\"USDXCD\":2.70255,\"USDXDR\":0.703628,\"USDXOF\":553.000297,\"USDXPF\":100.935859,\"USDYER\":250.375038,\"USDZAR\":15.407903,\"USDZMK\":9001.20592,\"USDZMW\":20.929584,\"USDZWL\":321.999941}}");
    }

    @Override
    public Double get(String currencyCode) {
        update();
        JSONObject jsonObject = (JSONObject) super.get().get("quotes");
        return (Double) jsonObject.get(currencyCode);
    }
}
