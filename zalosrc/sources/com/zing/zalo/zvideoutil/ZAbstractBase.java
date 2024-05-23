package com.zing.zalo.zvideoutil;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import java.io.IOException;
import me0.AbstractC23254w8;
import mm0.AbstractC23350e;

/* loaded from: classes7.dex */
public abstract class ZAbstractBase {
    private static final String TAG = "ZVideoUtil";
    public static final int ZVU_BLEND_GEN_THUMB = 1003;
    public static final int ZVU_BLEND_PERCENTAGE = 1002;
    public static final int ZVU_EVENT_STATE_COMPLETE = 100;
    public static final int ZVU_EVENT_STATE_ERROR = -1;
    public static final int ZVU_EVENT_STATE_INVALID_INPUT = -2;
    public static final int ZVU_EVENT_STATE_INVALID_OUTPUT = -3;
    public static final int ZVU_FLUSH = 0;
    public static final int ZVU_PROCESS_FLUSH = 2000;
    public static final int ZVU_PROCESS_GIF_TO_MP4 = 2001;
    public static final int ZVU_PROCESS_HLS_TO_MP4 = 2004;
    public static final int ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE = 2003;
    public static final int ZVU_PROCESS_VIDEO_TO_WEBP = 2002;
    public static final int ZVU_TRANSCODE_PERCENTAGE = 1001;
    protected static volatile boolean mIsLibraryLoaded = false;
    private static final Object sLock = new Object();

    static boolean isLibraryLoaded() {
        if (!mIsLibraryLoaded) {
            loadLibrariesOnce();
        }
        return mIsLibraryLoaded;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void loadLibrariesOnce() {
        if (!mIsLibraryLoaded) {
            synchronized (sLock) {
                try {
                    if (!mIsLibraryLoaded) {
                        NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84880W);
                        mIsLibraryLoaded = true;
                    }
                } catch (Throwable th2) {
                    mIsLibraryLoaded = false;
                    th2.printStackTrace();
                    AbstractC23350e.m122775e(TAG, "Could not load native library: zvideoutil", th2);
                } finally {
                }
            }
        }
    }

    public static String reformatVideoPath(String str) {
        try {
            if (AbstractC23254w8.m119859g(str)) {
                ParcelFileDescriptor openFileDescriptor = CoreUtility.getAppContext().getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    str = "pipe:" + openFileDescriptor.detachFd();
                    openFileDescriptor.close();
                    return str;
                }
                return str;
            }
            return str;
        } catch (IOException e11) {
            e11.printStackTrace();
            return str;
        }
    }
}
