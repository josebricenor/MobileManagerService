package com.jb.mobilemanagerservice.dto;


import com.google.gson.annotations.SerializedName;
import java.util.Objects;

public class FonoApiDto {

  @SerializedName("technology")
  private String technology;

  @SerializedName("gprs")
  private String gprs;

  @SerializedName("edge")
  private String edge;

  @SerializedName("announced")
  private String announced;

  @SerializedName("status")
  private String status;

  @SerializedName("dimensions")
  private String dimensions;

  @SerializedName("weight")
  private String weight;

  @SerializedName("sim")
  private String sim;

  @SerializedName("type")
  private String type;

  @SerializedName("size")
  private String size;

  @SerializedName("resolution")
  private String resolution;

  @SerializedName("card_slot")
  private String cardSlot;

  @SerializedName("phonebook")
  private String phonebook;

  @SerializedName("call_records")
  private String callRecords;

  @SerializedName("camera_c")
  private String cameraC;

  @SerializedName("alert_types")
  private String alertTypes;

  @SerializedName("loudspeaker_")
  private String loudspeaker;

  @SerializedName("_3_5mm_jack_")
  private String jack35mm;

  @SerializedName("sound_c")
  private String soundC;

  @SerializedName("wlan")
  private String wlan;

  @SerializedName("bluetooth")
  private String bluetooth;

  @SerializedName("gps")
  private String gps;

  @SerializedName("infrared_port")
  private String infraredPort;

  @SerializedName("radio")
  private String radio;

  @SerializedName("usb")
  private String usb;

  @SerializedName("messaging")
  private String messaging;

  @SerializedName("browser")
  private String browser;

  @SerializedName("clock")
  private String clock;

  @SerializedName("alarm")
  private String alarm;

  @SerializedName("games")
  private String games;

  @SerializedName("languages")
  private String languages;

  @SerializedName("java")
  private String java;

  @SerializedName("features_c")
  private String featuresC;

  @SerializedName("battery_c")
  private String batteryC;

  @SerializedName("stand_by")
  private String standBy;

  @SerializedName("talk_time")
  private String talkTime;

  @SerializedName("colors")
  private String colors;

  @SerializedName("sensors")
  private String sensors;

  @SerializedName("cpu")
  private String cpu;

  @SerializedName("internal")
  private String internal;

  @SerializedName("os")
  private String os;

  @SerializedName("body_c")
  private String bodyC;

  @SerializedName("keyboard")
  private String keyboard;

  @SerializedName("primary_")
  private String primary;

  @SerializedName("video")
  private String video;

  @SerializedName("secondary")
  private String secondary;

  @SerializedName("speed")
  private String speed;

  @SerializedName("network_c")
  private String networkC;

  @SerializedName("chipset")
  private String chipset;

  @SerializedName("features")
  private String features;

  @SerializedName("music_play")
  private String musicPlay;

  @SerializedName("protection")
  private String protection;

  @SerializedName("gpu")
  private String gpu;

  @SerializedName("multitouch")
  private String multitouch;

  @SerializedName("audio_quality")
  private String audioQuality;

  @SerializedName("nfc")
  private String nfc;

  @SerializedName("camera")
  private String camera;

  @SerializedName("display")
  private String display;

  @SerializedName("battery_life")
  private String batteryLife;

  @SerializedName("_2g_bands")
  private String bands2g;

  @SerializedName("_3g_bands")
  private String bands3g;

  @SerializedName("_4g_bands")
  private String bands4g;

  @Override
  public String toString() {
    return "FonoApiDto{" +
        "technology='" + technology + '\'' +
        ", gprs='" + gprs + '\'' +
        ", edge='" + edge + '\'' +
        ", announced='" + announced + '\'' +
        ", status='" + status + '\'' +
        ", dimensions='" + dimensions + '\'' +
        ", weight='" + weight + '\'' +
        ", sim='" + sim + '\'' +
        ", type='" + type + '\'' +
        ", size='" + size + '\'' +
        ", resolution='" + resolution + '\'' +
        ", cardSlot='" + cardSlot + '\'' +
        ", phonebook='" + phonebook + '\'' +
        ", callRecords='" + callRecords + '\'' +
        ", cameraC='" + cameraC + '\'' +
        ", alertTypes='" + alertTypes + '\'' +
        ", loudspeaker='" + loudspeaker + '\'' +
        ", jack35mm='" + jack35mm + '\'' +
        ", soundC='" + soundC + '\'' +
        ", wlan='" + wlan + '\'' +
        ", bluetooth='" + bluetooth + '\'' +
        ", gps='" + gps + '\'' +
        ", infraredPort='" + infraredPort + '\'' +
        ", radio='" + radio + '\'' +
        ", usb='" + usb + '\'' +
        ", messaging='" + messaging + '\'' +
        ", browser='" + browser + '\'' +
        ", clock='" + clock + '\'' +
        ", alarm='" + alarm + '\'' +
        ", games='" + games + '\'' +
        ", languages='" + languages + '\'' +
        ", java='" + java + '\'' +
        ", featuresC='" + featuresC + '\'' +
        ", batteryC='" + batteryC + '\'' +
        ", standBy='" + standBy + '\'' +
        ", talkTime='" + talkTime + '\'' +
        ", colors='" + colors + '\'' +
        ", sensors='" + sensors + '\'' +
        ", cpu='" + cpu + '\'' +
        ", internal='" + internal + '\'' +
        ", os='" + os + '\'' +
        ", bodyC='" + bodyC + '\'' +
        ", keyboard='" + keyboard + '\'' +
        ", primary='" + primary + '\'' +
        ", video='" + video + '\'' +
        ", secondary='" + secondary + '\'' +
        ", speed='" + speed + '\'' +
        ", networkC='" + networkC + '\'' +
        ", chipset='" + chipset + '\'' +
        ", features='" + features + '\'' +
        ", musicPlay='" + musicPlay + '\'' +
        ", protection='" + protection + '\'' +
        ", gpu='" + gpu + '\'' +
        ", multitouch='" + multitouch + '\'' +
        ", loudspeaker='" + loudspeaker + '\'' +
        ", audioQuality='" + audioQuality + '\'' +
        ", nfc='" + nfc + '\'' +
        ", camera='" + camera + '\'' +
        ", display='" + display + '\'' +
        ", batteryLife='" + batteryLife + '\'' +
        ", bands2g='" + bands2g + '\'' +
        ", bands3g='" + bands3g + '\'' +
        ", bands4g='" + bands4g + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FonoApiDto that = (FonoApiDto) o;
    return Objects.equals(technology, that.technology) && Objects.equals(gprs,
        that.gprs) && Objects.equals(edge, that.edge) && Objects.equals(announced,
        that.announced) && Objects.equals(status, that.status) && Objects.equals(
        dimensions, that.dimensions) && Objects.equals(weight, that.weight)
        && Objects.equals(sim, that.sim) && Objects.equals(type, that.type)
        && Objects.equals(size, that.size) && Objects.equals(resolution,
        that.resolution) && Objects.equals(cardSlot, that.cardSlot)
        && Objects.equals(phonebook, that.phonebook) && Objects.equals(
        callRecords, that.callRecords) && Objects.equals(cameraC, that.cameraC)
        && Objects.equals(alertTypes, that.alertTypes) && Objects.equals(
        loudspeaker, that.loudspeaker) && Objects.equals(jack35mm, that.jack35mm)
        && Objects.equals(soundC, that.soundC) && Objects.equals(wlan, that.wlan)
        && Objects.equals(bluetooth, that.bluetooth) && Objects.equals(gps,
        that.gps) && Objects.equals(infraredPort, that.infraredPort)
        && Objects.equals(radio, that.radio) && Objects.equals(usb, that.usb)
        && Objects.equals(messaging, that.messaging) && Objects.equals(browser,
        that.browser) && Objects.equals(clock, that.clock) && Objects.equals(
        alarm, that.alarm) && Objects.equals(games, that.games) && Objects.equals(
        languages, that.languages) && Objects.equals(java, that.java)
        && Objects.equals(featuresC, that.featuresC) && Objects.equals(batteryC,
        that.batteryC) && Objects.equals(standBy, that.standBy) && Objects.equals(
        talkTime, that.talkTime) && Objects.equals(colors, that.colors)
        && Objects.equals(sensors, that.sensors) && Objects.equals(cpu, that.cpu)
        && Objects.equals(internal, that.internal) && Objects.equals(os, that.os)
        && Objects.equals(bodyC, that.bodyC) && Objects.equals(keyboard,
        that.keyboard) && Objects.equals(primary, that.primary) && Objects.equals(
        video, that.video) && Objects.equals(secondary, that.secondary)
        && Objects.equals(speed, that.speed) && Objects.equals(networkC,
        that.networkC) && Objects.equals(chipset, that.chipset) && Objects.equals(
        features, that.features) && Objects.equals(musicPlay, that.musicPlay)
        && Objects.equals(protection, that.protection) && Objects.equals(gpu,
        that.gpu) && Objects.equals(multitouch, that.multitouch)
        && Objects.equals(loudspeaker, that.loudspeaker) && Objects.equals(
        audioQuality, that.audioQuality) && Objects.equals(nfc, that.nfc)
        && Objects.equals(camera, that.camera) && Objects.equals(display,
        that.display) && Objects.equals(batteryLife, that.batteryLife)
        && Objects.equals(bands2g, that.bands2g) && Objects.equals(bands3g,
        that.bands3g) && Objects.equals(bands4g, that.bands4g);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technology, gprs, edge, announced, status, dimensions, weight, sim, type,
        size, resolution, cardSlot, phonebook, callRecords, cameraC, alertTypes, loudspeaker,
        jack35mm, soundC, wlan, bluetooth, gps, infraredPort, radio, usb, messaging, browser, clock,
        alarm, games, languages, java, featuresC, batteryC, standBy, talkTime, colors, sensors, cpu,
        internal, os, bodyC, keyboard, primary, video, secondary, speed, networkC, chipset,
        features,
        musicPlay, protection, gpu, multitouch, loudspeaker, audioQuality, nfc, camera, display,
        batteryLife, bands2g, bands3g, bands4g);
  }

  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }

  public String getGprs() {
    return gprs;
  }

  public void setGprs(String gprs) {
    this.gprs = gprs;
  }

  public String getEdge() {
    return edge;
  }

  public void setEdge(String edge) {
    this.edge = edge;
  }

  public String getAnnounced() {
    return announced;
  }

  public void setAnnounced(String announced) {
    this.announced = announced;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDimensions() {
    return dimensions;
  }

  public void setDimensions(String dimensions) {
    this.dimensions = dimensions;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getSim() {
    return sim;
  }

  public void setSim(String sim) {
    this.sim = sim;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public String getCardSlot() {
    return cardSlot;
  }

  public void setCardSlot(String cardSlot) {
    this.cardSlot = cardSlot;
  }

  public String getPhonebook() {
    return phonebook;
  }

  public void setPhonebook(String phonebook) {
    this.phonebook = phonebook;
  }

  public String getCallRecords() {
    return callRecords;
  }

  public void setCallRecords(String callRecords) {
    this.callRecords = callRecords;
  }

  public String getCameraC() {
    return cameraC;
  }

  public void setCameraC(String cameraC) {
    this.cameraC = cameraC;
  }

  public String getAlertTypes() {
    return alertTypes;
  }

  public void setAlertTypes(String alertTypes) {
    this.alertTypes = alertTypes;
  }

  public String getLoudspeaker() {
    return loudspeaker;
  }

  public void setLoudspeaker(String loudspeaker) {
    this.loudspeaker = loudspeaker;
  }

  public String getAudioQuality() {
    return audioQuality;
  }

  public void setAudioQuality(String audioQuality) {
    this.audioQuality = audioQuality;
  }

  public String getNfc() {
    return nfc;
  }

  public void setNfc(String nfc) {
    this.nfc = nfc;
  }

  public String getCamera() {
    return camera;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }

  public String getDisplay() {
    return display;
  }

  public void setDisplay(String display) {
    this.display = display;
  }

  public String getBatteryLife() {
    return batteryLife;
  }

  public void setBatteryLife(String batteryLife) {
    this.batteryLife = batteryLife;
  }

  public String getBands2g() {
    return bands2g;
  }

  public void setBands2g(String bands2g) {
    this.bands2g = bands2g;
  }

  public String getBands3g() {
    return bands3g;
  }

  public void setBands3g(String bands3g) {
    this.bands3g = bands3g;
  }

  public String getBands4g() {
    return bands4g;
  }

  public void setBands4g(String bands4g) {
    this.bands4g = bands4g;
  }

  public String getJack35mm() {
    return jack35mm;
  }

  public void setJack35mm(String jack35mm) {
    this.jack35mm = jack35mm;
  }

  public String getSoundC() {
    return soundC;
  }

  public void setSoundC(String soundC) {
    this.soundC = soundC;
  }

  public String getWlan() {
    return wlan;
  }

  public void setWlan(String wlan) {
    this.wlan = wlan;
  }

  public String getBluetooth() {
    return bluetooth;
  }

  public void setBluetooth(String bluetooth) {
    this.bluetooth = bluetooth;
  }

  public String getGps() {
    return gps;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public String getInfraredPort() {
    return infraredPort;
  }

  public void setInfraredPort(String infraredPort) {
    this.infraredPort = infraredPort;
  }

  public String getRadio() {
    return radio;
  }

  public void setRadio(String radio) {
    this.radio = radio;
  }

  public String getUsb() {
    return usb;
  }

  public void setUsb(String usb) {
    this.usb = usb;
  }

  public String getMessaging() {
    return messaging;
  }

  public void setMessaging(String messaging) {
    this.messaging = messaging;
  }

  public String getBrowser() {
    return browser;
  }

  public void setBrowser(String browser) {
    this.browser = browser;
  }

  public String getClock() {
    return clock;
  }

  public void setClock(String clock) {
    this.clock = clock;
  }

  public String getAlarm() {
    return alarm;
  }

  public void setAlarm(String alarm) {
    this.alarm = alarm;
  }

  public String getGames() {
    return games;
  }

  public void setGames(String games) {
    this.games = games;
  }

  public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }

  public String getJava() {
    return java;
  }

  public void setJava(String java) {
    this.java = java;
  }

  public String getFeaturesC() {
    return featuresC;
  }

  public void setFeaturesC(String featuresC) {
    this.featuresC = featuresC;
  }

  public String getBatteryC() {
    return batteryC;
  }

  public void setBatteryC(String batteryC) {
    this.batteryC = batteryC;
  }

  public String getStandBy() {
    return standBy;
  }

  public void setStandBy(String standBy) {
    this.standBy = standBy;
  }

  public String getTalkTime() {
    return talkTime;
  }

  public void setTalkTime(String talkTime) {
    this.talkTime = talkTime;
  }

  public String getColors() {
    return colors;
  }

  public void setColors(String colors) {
    this.colors = colors;
  }

  public String getSensors() {
    return sensors;
  }

  public void setSensors(String sensors) {
    this.sensors = sensors;
  }

  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public String getInternal() {
    return internal;
  }

  public void setInternal(String internal) {
    this.internal = internal;
  }

  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public String getBodyC() {
    return bodyC;
  }

  public void setBodyC(String bodyC) {
    this.bodyC = bodyC;
  }

  public String getKeyboard() {
    return keyboard;
  }

  public void setKeyboard(String keyboard) {
    this.keyboard = keyboard;
  }

  public String getPrimary() {
    return primary;
  }

  public void setPrimary(String primary) {
    this.primary = primary;
  }

  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public String getSecondary() {
    return secondary;
  }

  public void setSecondary(String secondary) {
    this.secondary = secondary;
  }

  public String getSpeed() {
    return speed;
  }

  public void setSpeed(String speed) {
    this.speed = speed;
  }

  public String getNetworkC() {
    return networkC;
  }

  public void setNetworkC(String networkC) {
    this.networkC = networkC;
  }

  public String getChipset() {
    return chipset;
  }

  public void setChipset(String chipset) {
    this.chipset = chipset;
  }

  public String getFeatures() {
    return features;
  }

  public void setFeatures(String features) {
    this.features = features;
  }

  public String getMusicPlay() {
    return musicPlay;
  }

  public void setMusicPlay(String musicPlay) {
    this.musicPlay = musicPlay;
  }

  public String getProtection() {
    return protection;
  }

  public void setProtection(String protection) {
    this.protection = protection;
  }

  public String getGpu() {
    return gpu;
  }

  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  public String getMultitouch() {
    return multitouch;
  }

  public void setMultitouch(String multitouch) {
    this.multitouch = multitouch;
  }
}
