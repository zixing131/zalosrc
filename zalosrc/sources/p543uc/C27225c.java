package p543uc;

import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.backuprestore.media.exception.DriveFileNotFoundException;
import com.zing.zalo.backuprestore.media.exception.DriveRateLimitException;
import com.zing.zalo.backuprestore.media.exception.DriveStorageQuotaException;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19074t;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p667y2.C30268e;
import si.C26263i;

/* renamed from: uc.c */
/* loaded from: classes3.dex */
public final class C27225c {

    /* renamed from: a */
    public static final C27225c f127989a = new C27225c();

    private C27225c() {
    }

    /* renamed from: b */
    public static final void m139327b(int i11) {
        if (!C26263i.m135055u().m135069I()) {
        } else {
            throw new BackupRestoreMediaException(i11, 2007, "Interrupt process (current user is logout or changed)");
        }
    }

    /* renamed from: c */
    private final String m139328c(String str, int i11, String str2) {
        if (str2.length() == 0) {
            return "[" + str + "] (" + i11 + ")";
        }
        return "[" + str + "] " + str2 + " (" + i11 + ")";
    }

    /* renamed from: d */
    static /* synthetic */ String m139329d(C27225c c27225c, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            str2 = "";
        }
        return c27225c.m139328c(str, i11, str2);
    }

    /* renamed from: e */
    public static final void m139330e(String str, int i11, Exception exc) {
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
        if ((exc instanceof FileNotFoundException) && i11 == 4) {
            AbstractC23350e.m122782l("File not found. Maybe delete while syncing", new Object[0]);
            return;
        }
        if (!(exc instanceof UnknownHostException)) {
            if (!(exc instanceof SocketException)) {
                if (!(exc instanceof SSLException)) {
                    if (!(exc instanceof BackupRestoreMediaException)) {
                        if (!(exc instanceof InterruptedException) && !(exc instanceof InterruptedIOException)) {
                            if ((exc instanceof IOException) && !AbstractC23238v2.m119726k()) {
                                throw new BackupRestoreMediaException(i11, 2008, "[" + str + "] Full device storage!");
                            }
                            throw new BackupRestoreMediaException(i11, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "[" + str + "] " + exc);
                        }
                        if (exc instanceof SocketTimeoutException) {
                            throw new BackupRestoreMediaException(i11, 2006, "[" + str + "] " + exc);
                        }
                        throw new BackupRestoreMediaException(i11, 2007, "[" + str + "] " + exc);
                    }
                    throw exc;
                }
                throw new BackupRestoreMediaException(i11, 2006, "[" + str + "] " + exc);
            }
            throw new BackupRestoreMediaException(i11, 2006, "[" + str + "] " + exc);
        }
        throw new BackupRestoreMediaException(i11, 2006, "[" + str + "] " + exc);
    }

    /* renamed from: f */
    public static final void m139331f(String str, int i11, int i12, HttpURLConnection httpURLConnection) {
        AbstractC19074t.m100208f(httpURLConnection, "conn");
        if (i12 != 401) {
            if (i12 != 403) {
                if (i12 != 404) {
                    if (i12 / 100 == 5) {
                        throw new BackupRestoreMediaException(i11, 2011, m139329d(f127989a, str, i12, null, 4, null));
                    }
                    throw new BackupRestoreMediaException(i11, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, m139329d(f127989a, str, i12, null, 4, null));
                }
                throw new DriveFileNotFoundException(i11, m139329d(f127989a, str, i12, null, 4, null));
            }
            throw f127989a.m139332g(str, i11, i12, httpURLConnection);
        }
        AbstractC23306f.m120688m().m132984C(3);
        throw new DriveAuthException(i11, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, m139329d(f127989a, str, i12, null, 4, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[Catch: IOException -> 0x00b3, TRY_LEAVE, TryCatch #4 {IOException -> 0x00b3, blocks: (B:55:0x00af, B:48:0x00b7), top: B:54:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final BackupRestoreMediaException m139332g(String str, int i11, int i12, HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader;
        Exception e11;
        InputStream inputStream;
        int m139319a;
        String str2 = "";
        InputStream inputStream2 = null;
        try {
            try {
                inputStream = httpURLConnection.getErrorStream();
            } catch (Exception e12) {
                bufferedReader = null;
                e11 = e12;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                if (inputStream2 != null) {
                }
                if (bufferedReader != null) {
                }
                throw th;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Exception e13) {
                bufferedReader = null;
                e11 = e13;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                }
                if (bufferedReader != null) {
                }
                throw th;
            }
            try {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = null;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            str3 = readLine;
                        } else {
                            readLine = null;
                        }
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(str3);
                    }
                    String sb3 = sb2.toString();
                    AbstractC19074t.m100207e(sb3, "toString(...)");
                    if (sb3.length() > 0) {
                        try {
                            String string = new JSONObject(sb3).getJSONObject(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR).getJSONArray("errors").getJSONObject(0).getString("reason");
                            AbstractC19074t.m100207e(string, "getString(...)");
                            str2 = string;
                        } catch (Exception e14) {
                            AbstractC23350e.m122778h(e14);
                        }
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    bufferedReader.close();
                } catch (Throwable th4) {
                    th = th4;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            AbstractC23350e.m122778h(e15);
                            throw th;
                        }
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (Exception e16) {
                e11 = e16;
                AbstractC23350e.m122778h(e11);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                m139319a = C27223a.f127987a.m139319a(str2);
                String m139328c = m139328c(str, i12, str2);
                switch (m139319a) {
                }
            }
        } catch (IOException e17) {
            AbstractC23350e.m122778h(e17);
        }
        m139319a = C27223a.f127987a.m139319a(str2);
        String m139328c2 = m139328c(str, i12, str2);
        switch (m139319a) {
            case 40302:
            case 40303:
                return new DriveRateLimitException(i11, m139319a, m139328c2);
            case 40304:
            default:
                return new BackupRestoreMediaException(i11, m139319a, m139328c2);
            case 40305:
                return new DriveStorageQuotaException(i11, m139319a, m139328c2);
        }
    }

    /* renamed from: a */
    public final boolean m139333a(BackupRestoreMediaException backupRestoreMediaException) {
        AbstractC19074t.m100208f(backupRestoreMediaException, C30268e.f140632a);
        int m37267a = backupRestoreMediaException.m37267a();
        if (m37267a != 2006 && m37267a != 2010 && m37267a != 2011) {
            return false;
        }
        return true;
    }
}
