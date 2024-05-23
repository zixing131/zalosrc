package af0;

import am.AbstractC0924m0;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import bn0.AbstractC2932a;
import bn0.AbstractC2933b;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23355j;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p371nv.C23952g;
import p565v2.AbstractC27450f;

/* renamed from: af0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0777e {
    /* renamed from: a */
    public static final void m1935a(String str) {
        AbstractC19074t.m100208f(str, "tag");
        if (!MainApplication.f37852R) {
            if (MainApplication.Companion.m35504g() == 0) {
                AbstractC23355j.m122794b(new IllegalAccessException("main-application is not created: " + str));
                return;
            }
            AbstractC23355j.m122794b(new IllegalAccessException("call main flow from non-zalo-main-process: " + str));
        }
    }

    /* renamed from: b */
    public static final JSONObject m1936b(ApplicationExitInfo applicationExitInfo) {
        int reason;
        int reason2;
        String description;
        int importance;
        int pid;
        String processName;
        int status;
        long pss;
        long rss;
        long timestamp;
        String processName2;
        AbstractC19074t.m100208f(applicationExitInfo, "applicationExitInfo");
        JSONObject jSONObject = new JSONObject();
        reason = applicationExitInfo.getReason();
        jSONObject.put("reason", reason);
        reason2 = applicationExitInfo.getReason();
        jSONObject.put("reasonText", m1937c(reason2));
        description = applicationExitInfo.getDescription();
        jSONObject.put("description", description);
        importance = applicationExitInfo.getImportance();
        jSONObject.put("importance", importance);
        pid = applicationExitInfo.getPid();
        jSONObject.put("pid", pid);
        processName = applicationExitInfo.getProcessName();
        if (!AbstractC19074t.m100204b(BuildConfig.APPLICATION_ID, processName)) {
            processName2 = applicationExitInfo.getProcessName();
            jSONObject.put("processName", processName2);
        }
        status = applicationExitInfo.getStatus();
        jSONObject.put("status", status);
        pss = applicationExitInfo.getPss();
        jSONObject.put("pss", pss);
        rss = applicationExitInfo.getRss();
        jSONObject.put("rss", rss);
        timestamp = applicationExitInfo.getTimestamp();
        jSONObject.put("timestamp", timestamp);
        return jSONObject;
    }

    /* renamed from: c */
    public static final String m1937c(int i11) {
        switch (i11) {
            case 0:
                return "REASON_UNKNOWN";
            case 1:
                return "REASON_EXIT_SELF";
            case 2:
                return "REASON_SIGNALED";
            case 3:
                return "REASON_LOW_MEMORY";
            case 4:
                return "REASON_CRASH";
            case 5:
                return "REASON_CRASH_NATIVE";
            case 6:
                return "REASON_ANR";
            case 7:
                return "REASON_INITIALIZATION_FAILURE";
            case 8:
                return "REASON_PERMISSION_CHANGE";
            case 9:
                return "REASON_EXCESSIVE_RESOURCE_USAGE";
            case 10:
                return "REASON_USER_REQUESTED";
            case 11:
                return "REASON_USER_STOPPED";
            case 12:
                return "REASON_DEPENDENCY_DIED";
            case 13:
                return "REASON_OTHER";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: d */
    public static final void m1938d(Context context) {
        List historicalProcessExitReasons;
        long timestamp;
        long timestamp2;
        int reason;
        int reason2;
        long timestamp3;
        InputStream traceInputStream;
        String str;
        int reason3;
        long timestamp4;
        InputStream traceInputStream2;
        AbstractC19074t.m100208f(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object systemService = context.getSystemService("activity");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        String str2 = null;
        char c11 = 0;
        historicalProcessExitReasons = ((ActivityManager) systemService).getHistoricalProcessExitReasons(null, 0, 0);
        AbstractC19074t.m100207e(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        ArrayList arrayList = new ArrayList();
        long m3154J1 = AbstractC0924m0.m3154J1();
        Iterator it = historicalProcessExitReasons.iterator();
        long j11 = -1;
        while (it.hasNext()) {
            ApplicationExitInfo m140489a = AbstractC27450f.m140489a(it.next());
            timestamp = m140489a.getTimestamp();
            if (timestamp > j11) {
                j11 = m140489a.getTimestamp();
            }
            timestamp2 = m140489a.getTimestamp();
            if (timestamp2 <= m3154J1) {
                break;
            }
            AbstractC19074t.m100205c(m140489a);
            arrayList.add(m140489a);
            reason = m140489a.getReason();
            AbstractC20887g.m109217D((reason % 100) + 120200, str2, 2, str2);
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            Object[] objArr = new Object[1];
            objArr[c11] = m1936b(m140489a);
            aVar.mo104556o(8, "ApplicationExitInfo: %s", objArr);
            reason2 = m140489a.getReason();
            if (reason2 == 6) {
                try {
                    File cacheDir = context.getCacheDir();
                    timestamp3 = m140489a.getTimestamp();
                    File file = new File(cacheDir, "anr_" + timestamp3);
                    traceInputStream = m140489a.getTraceInputStream();
                    if (traceInputStream != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                AbstractC2932a.m13888b(traceInputStream, fileOutputStream, 0, 2, null);
                                AbstractC2933b.m13890a(fileOutputStream, null);
                                AbstractC2933b.m13890a(traceInputStream, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                    break;
                                } catch (Throwable th3) {
                                    AbstractC2933b.m13890a(fileOutputStream, th2);
                                    throw th3;
                                    break;
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th4) {
                            }
                        }
                    }
                    if (file.exists() && file.length() > 0) {
                        String path = file.getPath();
                        AbstractC19074t.m100207e(path, "getPath(...)");
                        C23952g.m125346k(1, path, true);
                    }
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 31) {
                reason3 = m140489a.getReason();
                if (reason3 == 5) {
                    try {
                        File cacheDir2 = context.getCacheDir();
                        timestamp4 = m140489a.getTimestamp();
                        File file2 = new File(cacheDir2, "crash_native_" + timestamp4);
                        traceInputStream2 = m140489a.getTraceInputStream();
                        if (traceInputStream2 != null) {
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                                str = null;
                                try {
                                    try {
                                        AbstractC2932a.m13888b(traceInputStream2, fileOutputStream2, 0, 2, null);
                                        AbstractC2933b.m13890a(fileOutputStream2, null);
                                        try {
                                            AbstractC2933b.m13890a(traceInputStream2, null);
                                        } catch (Exception unused2) {
                                            str2 = str;
                                            c11 = 0;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        Throwable th6 = th;
                                        try {
                                            throw th6;
                                            break;
                                        } catch (Throwable th7) {
                                            AbstractC2933b.m13890a(traceInputStream2, th6);
                                            throw th7;
                                            break;
                                        }
                                    }
                                } catch (Throwable th8) {
                                    try {
                                        throw th8;
                                        break;
                                    } catch (Throwable th9) {
                                        AbstractC2933b.m13890a(fileOutputStream2, th8);
                                        throw th9;
                                        break;
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                        if (file2.exists() && file2.length() > 0) {
                            String path2 = file2.getPath();
                            AbstractC19074t.m100207e(path2, "getPath(...)");
                            C23952g.m125346k(2, path2, true);
                        }
                    } catch (Exception unused3) {
                        str = null;
                    }
                    str2 = str;
                    c11 = 0;
                }
            }
            str = null;
            str2 = str;
            c11 = 0;
        }
        if (j11 > 0) {
            AbstractC0924m0.m3142Ii(j11);
        }
    }
}
