package org.webrtc;

import ho0.AbstractC20110a;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public class Logging {
    private static final Logger fallbackLogger = Logger.getLogger("zalo.voip.Logging");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.webrtc.Logging$1 */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C245111 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$org$webrtc$Logging$Severity = iArr;
            try {
                iArr[Severity.LS_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[Severity.LS_WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$Logging$Severity[Severity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public enum Severity {
        LS_SENSITIVE,
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR
    }

    /* renamed from: d */
    public static void m127853d(String str, String str2) {
        log(Severity.LS_INFO, str, str2);
    }

    /* renamed from: e */
    public static void m127854e(String str, String str2) {
        log(Severity.LS_ERROR, str, str2);
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        int i11 = C245111.$SwitchMap$org$webrtc$Logging$Severity[severity.ordinal()];
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    level = Level.FINE;
                    z11 = false;
                } else {
                    level = Level.INFO;
                }
            } else {
                level = Level.WARNING;
            }
        } else {
            level = Level.SEVERE;
        }
        fallbackLogger.log(level, str + ": " + str2);
        if (z11) {
            AbstractC20110a.m104542k(8, System.currentTimeMillis() + ":" + str + ": " + str2, new Object[0]);
        }
    }

    /* renamed from: v */
    public static void m127855v(String str, String str2) {
        log(Severity.LS_VERBOSE, str, str2);
    }

    /* renamed from: w */
    public static void m127856w(String str, String str2) {
        log(Severity.LS_WARNING, str, str2);
    }
}
