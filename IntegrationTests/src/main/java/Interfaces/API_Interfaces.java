package Interfaces;

/**
 * Created by Andrew on 3/6/2017.
 */
public interface API_Interfaces {

    public static String URL = "https://testbashnl.herokuapp.com";

    public String GET_CONFERENCES = "/conferences";

    public String FIND_BY_NAME = "/conferences/search/findByName?name=";

    public String FIND_BY_LOCATION = "/conferences/search/findByLocation?location=";

    public String FIND_BY_SPEAKER = "/conferences/search/findBySpeaker?speaker=";

    public String FIND_BY_THEME = "/conferences/search/findByTheme?theme=";

    public String FIND_BY_TAG = "/conferences/search/findByTag?tag=";

    public String FIND_BY_DATE = "/conferences/search/findByDate?date=";

    public String FIND_BY_C4PDATE = "/conferences/search/findByC4PDate?C4PDate=";

}
