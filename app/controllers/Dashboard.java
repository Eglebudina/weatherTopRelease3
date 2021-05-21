package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Station;
import models.Reading;
import models.Member;
import play.Logger;
import play.mvc.Controller;
import utils.Trends;

public class Dashboard extends Controller {
    public static void index() {
        Logger.info("Rendering Dasboard");
        Member member = Accounts.getLoggedInMember();
        List<Station> stations = member.stations;
        for (Station station : stations) {
            station.tempTrend = Trends.tempTrend(station.readings);
            station.windTrend = Trends.windTrend(station.readings);
            station.presTrend = Trends.presTrend(station.readings);
        }
        render("dashboard.html", stations);
    }

    public static void deleteStation(Long id) {
        Logger.info("Deleting a Station");
        Member member = Accounts.getLoggedInMember();
        Station station = Station.findById(id);
        member.stations.remove(station);
        member.save();
        station.delete();
        redirect("/dashboard");
    }

    public static void addStation(String name, double latitude, double longitude) {
        Logger.info("Adding a Station");
        Member member = Accounts.getLoggedInMember();
        Station station = new Station(name, latitude, longitude);
        member.stations.add(station);
        member.save();
        redirect("/dashboard");
    }
}
