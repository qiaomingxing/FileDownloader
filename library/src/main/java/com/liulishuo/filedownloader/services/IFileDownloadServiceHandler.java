package com.liulishuo.filedownloader.services;

import android.content.Intent;
import android.os.IBinder;

import com.liulishuo.filedownloader.services.FDServiceSharedHandler.FileDownloadServiceSharedConnection;

/**
 * Created by Jacksgong on 4/17/16.
 * <p/>
 * The handler for {@link FileDownloadService}, which handle real actions.
 *
 * @see FileDownloadMgr
 */
public interface IFileDownloadServiceHandler {
    /**
     * Will used to handling the onConnected in {@link FileDownloadServiceSharedConnection}.
     * <p/>
     * Called by the system every time a client explicitly starts the service by calling
     * {@link android.content.Context#startService}.
     */
    void onStartCommand(Intent intent, int flags, int startId);

    /**
     * Will establish the connection with binder in {@link FDServiceSeparateHandler}
     *
     * @return Return the communication channel to the service. Nullable.
     */
    IBinder onBind(Intent intent);

    /**
     * Called by the system to notify a Service that it is no longer used and is being removed.
     *
     * @see FileDownloadServiceSharedConnection
     * @see FDServiceSeparateHandler
     */
    void onDestroy();
}