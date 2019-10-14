package com.tonikelope.megabasterd;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author tonikelope @Mod Bilibox
 */
public interface Transference {

    int MIN_WORKERS = 1;
    int MAX_WORKERS = 100;
    int HTTP_CONNECT_TIMEOUT = 15000;
    int HTTP_PROXY_CONNECT_TIMEOUT = 15000;
    int HTTP_READ_TIMEOUT = 15000;
    int HTTP_PROXY_READ_TIMEOUT = 15000;
    int MAX_SIM_TRANSFERENCES = 20;
    int SIM_TRANSFERENCES_DEFAULT = 4;
    boolean LIMIT_TRANSFERENCE_SPEED_DEFAULT = false;
    int MAX_TRANSFERENCE_SPEED_DEFAULT = 5;
    int MAX_WAIT_WORKERS_SHUTDOWN = 15;
    Integer[] FATAL_API_ERROR_CODES = {-2, -4, -8, -14, -15, -16, -17, 22, 23, 24};
    Integer[] FATAL_API_ERROR_CODES_WITH_RETRY = {-4};

    void start();

    void stop();

    void pause();

    void restart();

    void close();

    boolean isPaused();

    boolean isStopped();

    boolean isFrozen();

    boolean isRestart();

    void unfreeze();

    void upWaitQueue();

    void downWaitQueue();

    void checkSlotsAndWorkers();

    ConcurrentLinkedQueue<Long> getPartialProgress();

    long getProgress();

    void setProgress(long progress);

    String getFile_name();

    long getFile_size();

    ProgressMeter getProgress_meter();

    MainPanel getMain_panel();

    TransferenceView getView();

    boolean isStatusError();

    int getSlotsCount();

}
