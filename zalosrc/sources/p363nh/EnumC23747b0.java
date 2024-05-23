package p363nh;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import me0.C23081g9;
import p348mi.AbstractC23309i;
import p632x4.AbstractC29320f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'z' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: nh.b0 */
/* loaded from: classes.dex */
public final class EnumC23747b0 {

    /* renamed from: A */
    public static final EnumC23747b0 f114854A;

    /* renamed from: B */
    public static final EnumC23747b0 f114855B;

    /* renamed from: C */
    public static final EnumC23747b0 f114856C;

    /* renamed from: D */
    public static final EnumC23747b0 f114857D;

    /* renamed from: E */
    public static final EnumC23747b0 f114858E;

    /* renamed from: F */
    public static final EnumC23747b0 f114859F;

    /* renamed from: G */
    public static final EnumC23747b0 f114860G;

    /* renamed from: H */
    public static final EnumC23747b0 f114861H;

    /* renamed from: I */
    public static final EnumC23747b0 f114862I;

    /* renamed from: J */
    public static final EnumC23747b0 f114863J;

    /* renamed from: K */
    public static final EnumC23747b0 f114864K;

    /* renamed from: L */
    public static final EnumC23747b0 f114865L;

    /* renamed from: M */
    private static final /* synthetic */ EnumC23747b0[] f114866M;

    /* renamed from: z */
    public static final EnumC23747b0 f114867z;

    /* renamed from: p */
    private final String f114868p;

    /* renamed from: q */
    private String f114869q;

    /* renamed from: r */
    private final String f114870r;

    /* renamed from: s */
    private final String[] f114871s;

    /* renamed from: t */
    private final EnumC23761i0 f114872t;

    /* renamed from: u */
    private long f114873u = 0;

    /* renamed from: v */
    private int f114874v = 3;

    /* renamed from: w */
    private Uri f114875w;

    /* renamed from: x */
    private boolean f114876x;

    /* renamed from: y */
    private long[] f114877y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nh.b0$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f114878a;

        static {
            int[] iArr = new int[EnumC23747b0.values().length];
            f114878a = iArr;
            try {
                iArr[EnumC23747b0.f114867z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f114878a[EnumC23747b0.f114854A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f114878a[EnumC23747b0.f114859F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f114878a[EnumC23747b0.f114860G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f114878a[EnumC23747b0.f114855B.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f114878a[EnumC23747b0.f114858E.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f114878a[EnumC23747b0.f114862I.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f114878a[EnumC23747b0.f114856C.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f114878a[EnumC23747b0.f114857D.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f114878a[EnumC23747b0.f114861H.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f114878a[EnumC23747b0.f114863J.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f114878a[EnumC23747b0.f114864K.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f114878a[EnumC23747b0.f114865L.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    static {
        EnumC23761i0 enumC23761i0 = EnumC23761i0.NOTIFICATIONS;
        f114867z = new EnumC23747b0("CHAT", 0, "zalo_010_chat_channel_", "Messages", enumC23761i0, null);
        f114854A = new EnumC23747b0("CHAT_GROUP", 1, "zalo_020_chat_group_channel_", "Messages Group", enumC23761i0, null);
        f114855B = new EnumC23747b0("CALL", 2, "zalo_03_call_channel_", "Calls", enumC23761i0, null);
        f114856C = new EnumC23747b0("SOCIAL_STORY", 3, "zalo_05_social_story_channel_", "Timeline and Stories", enumC23761i0, null);
        EnumC23761i0 enumC23761i02 = EnumC23761i0.ALERT_STYLES;
        f114857D = new EnumC23747b0("QUIET", 4, "zalo_060_quiet_channel_", "Quiet notification", enumC23761i02, null);
        f114858E = new EnumC23747b0("SILENT_IN_APP", 5, "zalo_062_silent_inapp_channel_", "Normal notification", enumC23761i02, null);
        f114859F = new EnumC23747b0("ALERT", 6, "zalo_063_alert_channel_", "Urgent notification", enumC23761i02, null);
        f114860G = new EnumC23747b0("DEFAULT", 7, "zalo_070_default_channel_", "Other", enumC23761i0, null);
        EnumC23761i0 enumC23761i03 = EnumC23761i0.ACTIVITY_INDICATORS;
        f114861H = new EnumC23747b0("MINI_CHAT", 8, "zalo_08_minichat_channel_", "MiniChat active", enumC23761i03, null);
        f114862I = new EnumC23747b0("IN_CALL", 9, "zalo_09_call_channel_", "Call in progress", enumC23761i03, null);
        f114863J = new EnumC23747b0("DB_ACTION", 10, "zalo_10_db_action_channel_", "Backup & restore in progress", enumC23761i03, null);
        f114864K = new EnumC23747b0("VIDEO_PROCESSING", 11, "zalo_11_video_processing_channel_", "Video processing", enumC23761i03, null);
        f114865L = new EnumC23747b0("LIVE_LOCATION", 12, "zalo_12_live_location_channel_", "Live location sharing", enumC23761i03, null);
        f114866M = m124123b();
    }

    private EnumC23747b0(String str, int i11, String str2, String str3, EnumC23761i0 enumC23761i0, String[] strArr) {
        this.f114868p = str2;
        this.f114870r = str3;
        this.f114871s = strArr;
        this.f114872t = enumC23761i0;
    }

    /* renamed from: b */
    private static /* synthetic */ EnumC23747b0[] m124123b() {
        return new EnumC23747b0[]{f114867z, f114854A, f114855B, f114856C, f114857D, f114858E, f114859F, f114860G, f114861H, f114862I, f114863J, f114864K, f114865L};
    }

    /* renamed from: c */
    public static EnumC23747b0 m124124c(String str) {
        if (str == null) {
            return null;
        }
        for (EnumC23747b0 enumC23747b0 : values()) {
            if (str.startsWith(enumC23747b0.f114868p)) {
                return enumC23747b0;
            }
        }
        return null;
    }

    /* renamed from: e */
    private String m124125e() {
        return this.f114868p + UUID.randomUUID();
    }

    /* renamed from: q */
    private void m124126q(NotificationManager notificationManager, boolean z11) {
        List notificationChannels;
        String id2;
        int importance;
        String id3;
        String id4;
        Uri sound;
        long[] vibrationPattern;
        boolean shouldVibrate;
        long[] jArr;
        String id5;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = notificationManager.getNotificationChannels();
            Iterator it = notificationChannels.iterator();
            while (it.hasNext()) {
                NotificationChannel m124195a = AbstractC23774p.m124195a(it.next());
                id2 = m124195a.getId();
                if (id2.startsWith(this.f114868p)) {
                    importance = m124195a.getImportance();
                    this.f114874v = importance;
                    id3 = m124195a.getId();
                    if (!id3.equals(this.f114869q)) {
                        id5 = m124195a.getId();
                        AbstractC20110a.m104535d("different channel-id: %s, %s", this.f114869q, id5);
                    }
                    id4 = m124195a.getId();
                    this.f114869q = id4;
                    sound = m124195a.getSound();
                    this.f114875w = sound;
                    vibrationPattern = m124195a.getVibrationPattern();
                    this.f114877y = vibrationPattern;
                    shouldVibrate = m124195a.shouldVibrate();
                    this.f114876x = shouldVibrate;
                    if (shouldVibrate && (jArr = this.f114877y) != null && jArr.length == 1 && jArr[0] == 0) {
                        this.f114876x = false;
                    }
                    this.f114873u = System.currentTimeMillis();
                    AbstractC20110a.m104535d("readChannelSetting: %d, %s, %s", Integer.valueOf(this.f114874v), this.f114869q, this);
                    return;
                }
            }
            if (z11) {
                m124127d(notificationManager, null);
            }
        }
    }

    public static EnumC23747b0 valueOf(String str) {
        return (EnumC23747b0) Enum.valueOf(EnumC23747b0.class, str);
    }

    public static EnumC23747b0[] values() {
        return (EnumC23747b0[]) f114866M.clone();
    }

    /* renamed from: d */
    public synchronized void m124127d(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        String id2;
        String id3;
        NotificationChannel notificationChannel2;
        int importance;
        int importance2;
        int lockscreenVisibility;
        boolean shouldVibrate;
        boolean shouldShowLights;
        Uri sound;
        boolean canShowBadge;
        AudioAttributes audioAttributes;
        int importance3;
        int importance4;
        String id4;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            String m124125e = m124125e();
            AbstractC20110a.m104535d("createChannel: %s - %s", this, m124125e);
            AbstractC23789y.m124253a();
            NotificationChannel m146468a = AbstractC29320f.m146468a(m124125e, this.f114870r, 3);
            m146468a.setLockscreenVisibility(1);
            m146468a.enableVibration(true);
            m146468a.enableLights(true);
            m146468a.setLightColor(AbstractC1388a.m6961c(CoreUtility.getAppContext(), AbstractC16801x.led_light_color));
            m146468a.setVibrationPattern(C23081g9.m118406c());
            EnumC23761i0 enumC23761i0 = this.f114872t;
            if (enumC23761i0 != null) {
                if (!enumC23761i0.m124184g(notificationManager)) {
                    this.f114872t.m124182d(notificationManager);
                }
                m146468a.setGroup(this.f114872t.m124183e());
            } else {
                EnumC23761i0 enumC23761i02 = EnumC23761i0.NOTIFICATIONS;
                if (!enumC23761i02.m124184g(notificationManager)) {
                    enumC23761i02.m124182d(notificationManager);
                }
                m146468a.setGroup(enumC23761i02.m124183e());
            }
            AudioAttributes m118405b = C23081g9.m118405b();
            m146468a.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, m118405b);
            long[] jArr = {0};
            switch (a.f114878a[ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    m146468a.setImportance(4);
                    break;
                case 5:
                    m146468a.setImportance(4);
                    m146468a.setSound(null, null);
                    break;
                case 6:
                    m146468a.setImportance(3);
                    break;
                case 7:
                    m146468a.setImportance(3);
                    m146468a.setVibrationPattern(jArr);
                    m146468a.enableVibration(true);
                    m146468a.setSound(null, null);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    m146468a.setImportance(2);
                    m146468a.setVibrationPattern(jArr);
                    m146468a.enableVibration(true);
                    m146468a.enableLights(false);
                    m146468a.setSound(null, m118405b);
                    break;
            }
            ArrayList arrayList = new ArrayList();
            if (notificationChannel != null) {
                id4 = notificationChannel.getId();
                arrayList.add(id4);
            } else {
                String[] strArr = this.f114871s;
                if (strArr != null) {
                    arrayList.addAll(Arrays.asList(strArr));
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    notificationChannel2 = notificationManager.getNotificationChannel((String) it.next());
                    if (notificationChannel2 != null) {
                        importance = notificationChannel2.getImportance();
                        importance2 = m146468a.getImportance();
                        if (importance != importance2) {
                            importance3 = notificationChannel2.getImportance();
                            AbstractC20110a.m104535d("createChannel inheritance getImportance: %d", Integer.valueOf(importance3));
                            importance4 = notificationChannel2.getImportance();
                            m146468a.setImportance(importance4);
                        }
                        lockscreenVisibility = notificationChannel2.getLockscreenVisibility();
                        AbstractC20110a.m104535d("createChannel inheritance lockscreenVisibility(read-only): %d", Integer.valueOf(lockscreenVisibility));
                        shouldVibrate = notificationChannel2.shouldVibrate();
                        m146468a.enableVibration(shouldVibrate);
                        AbstractC20110a.m104535d("createChannel inheritance vibration: %s", Boolean.valueOf(shouldVibrate));
                        shouldShowLights = notificationChannel2.shouldShowLights();
                        m146468a.enableLights(shouldShowLights);
                        AbstractC20110a.m104535d("createChannel inheritance lights: %s", Boolean.valueOf(shouldShowLights));
                        sound = notificationChannel2.getSound();
                        if (sound != null) {
                            AbstractC20110a.m104535d("createChannel inheritance sound: %s", sound);
                            audioAttributes = notificationChannel2.getAudioAttributes();
                            m146468a.setSound(sound, audioAttributes);
                        }
                        canShowBadge = notificationChannel2.canShowBadge();
                        m146468a.setShowBadge(canShowBadge);
                        AbstractC20110a.m104535d("createChannel inheritance showBadge: %s", Boolean.valueOf(canShowBadge));
                    }
                }
            }
            if (m124133r()) {
                m146468a.enableVibration(AbstractC23309i.m121827de());
                if (!AbstractC23309i.m121825dc()) {
                    m146468a.setSound(null, m118405b);
                }
            }
            if (m124135t() && AbstractC23309i.m120753Ag()) {
                m146468a.setSound(null, m118405b);
                m146468a.setVibrationPattern(jArr);
                m146468a.enableVibration(true);
            }
            if (m124131j()) {
                m146468a.setImportance(4);
            }
            if (notificationChannel != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete notification channel (recreate flow): ");
                id2 = notificationChannel.getId();
                sb2.append(id2);
                AbstractC20110a.m104542k(8, sb2.toString(), new Object[0]);
                id3 = notificationChannel.getId();
                notificationManager.deleteNotificationChannel(id3);
            }
            notificationManager.createNotificationChannel(m146468a);
            AbstractC20110a.m104542k(8, "create notification channel: " + m124125e, new Object[0]);
            m124126q(notificationManager, false);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g */
    public String m124128g() {
        if (this.f114869q == null) {
            if (Build.VERSION.SDK_INT < 26) {
                return this.f114868p;
            }
            m124126q((NotificationManager) CoreUtility.getAppContext().getSystemService("notification"), true);
        }
        return this.f114869q;
    }

    /* renamed from: h */
    public int m124129h() {
        m124140y();
        return this.f114874v;
    }

    /* renamed from: i */
    public Uri m124130i() {
        return this.f114875w;
    }

    /* renamed from: j */
    public boolean m124131j() {
        return this == f114855B;
    }

    /* renamed from: m */
    public boolean m124132m(NotificationChannel notificationChannel) {
        String id2;
        String group;
        int importance;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (m124131j()) {
            importance = notificationChannel.getImportance();
            if (importance < 4) {
                return true;
            }
        }
        id2 = notificationChannel.getId();
        if (id2.startsWith(this.f114868p)) {
            String m124183e = this.f114872t.m124183e();
            group = notificationChannel.getGroup();
            if (m124183e.equals(group)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public boolean m124133r() {
        int i11 = a.f114878a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public boolean m124134s() {
        int i11 = a.f114878a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m124135t() {
        int i11 = a.f114878a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public boolean m124136u() {
        int i11 = a.f114878a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean m124137v() {
        switch (a.f114878a[ordinal()]) {
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return false;
            case 8:
            default:
                return true;
        }
    }

    /* renamed from: w */
    public boolean m124138w() {
        int i11 = a.f114878a[ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean m124139x() {
        return this.f114876x;
    }

    /* renamed from: y */
    public void m124140y() {
        if (Math.abs(System.currentTimeMillis() - this.f114873u) < 1000) {
            return;
        }
        m124126q((NotificationManager) CoreUtility.getAppContext().getSystemService("notification"), false);
    }
}
