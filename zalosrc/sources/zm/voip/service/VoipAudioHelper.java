package zm.voip.service;

import ag0.AbstractC0837p0;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.os.Build;
import au.AbstractC2351i;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3108t;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import me0.AbstractC23034c6;
import p097db.AbstractC17849h;
import p097db.C17843b;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p50.AbstractC24655g;
import qm0.AbstractC25358n;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;

/* loaded from: classes7.dex */
public final class VoipAudioHelper {

    /* renamed from: A */
    private static AudioManager.OnCommunicationDeviceChangedListener f148750A;

    /* renamed from: a */
    public static final VoipAudioHelper f148751a = new VoipAudioHelper();

    /* renamed from: b */
    private static final List f148752b;

    /* renamed from: c */
    private static final List f148753c;

    /* renamed from: d */
    private static final List f148754d;

    /* renamed from: e */
    private static final List f148755e;

    /* renamed from: f */
    private static boolean f148756f;

    /* renamed from: g */
    private static boolean f148757g;

    /* renamed from: h */
    private static AudioDeviceInfo f148758h;

    /* renamed from: i */
    private static boolean f148759i;

    /* renamed from: j */
    private static int f148760j;

    /* renamed from: k */
    private static int f148761k;

    /* renamed from: l */
    private static boolean f148762l;

    /* renamed from: m */
    private static boolean f148763m;

    /* renamed from: n */
    private static boolean f148764n;

    /* renamed from: o */
    private static boolean f148765o;

    /* renamed from: p */
    private static boolean f148766p;

    /* renamed from: q */
    private static volatile int f148767q;

    /* renamed from: r */
    private static AudioManager.OnAudioFocusChangeListener f148768r;

    /* renamed from: s */
    private static AudioAttributes f148769s;

    /* renamed from: t */
    private static BluetoothAdapter f148770t;

    /* renamed from: u */
    private static AudioFocusRequest f148771u;

    /* renamed from: v */
    private static AudioManager f148772v;

    /* renamed from: w */
    private static BluetoothDevice f148773w;

    /* renamed from: x */
    private static final BluetoothProfile.ServiceListener f148774x;

    /* renamed from: y */
    private static final VoipAudioHelper$receiver$1 f148775y;

    /* renamed from: z */
    private static AudioDeviceCallback f148776z;

    /* renamed from: zm.voip.service.VoipAudioHelper$a */
    /* loaded from: classes7.dex */
    public static final class C32244a extends AudioDeviceCallback {
        C32244a() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            Object m131357E;
            int type;
            int type2;
            int type3;
            boolean isSink;
            if (audioDeviceInfoArr != null) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    type3 = audioDeviceInfo.getType();
                    isSink = audioDeviceInfo.isSink();
                    AbstractC3082b0.m15424f("VoipAudioHelper", "onAudioDevicesAdded " + type3 + " - " + isSink);
                }
            }
            if (audioDeviceInfoArr != null) {
                m131357E = AbstractC25358n.m131357E(audioDeviceInfoArr);
                AudioDeviceInfo m156392a = AbstractC32356v1.m156392a(m131357E);
                if (m156392a != null) {
                    VoipAudioHelper voipAudioHelper = VoipAudioHelper.f148751a;
                    type = m156392a.getType();
                    if (!voipAudioHelper.m155583Z(type)) {
                        type2 = m156392a.getType();
                        if (voipAudioHelper.m155596f0(type2)) {
                            VoipAudioHelper.m155538B0(0);
                            return;
                        }
                        return;
                    }
                    VoipAudioHelper.m155538B0(2);
                }
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            int type;
            boolean isSink;
            VoipAudioHelper voipAudioHelper;
            AudioDeviceInfo m155568R;
            int type2;
            int type3;
            if (audioDeviceInfoArr != null) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    type = audioDeviceInfo.getType();
                    isSink = audioDeviceInfo.isSink();
                    AbstractC3082b0.m15424f("VoipAudioHelper", "onAudioDevicesRemoved " + type + " - " + isSink);
                    if (Build.VERSION.SDK_INT >= 31 && (m155568R = (voipAudioHelper = VoipAudioHelper.f148751a).m155568R()) != null) {
                        type2 = m155568R.getType();
                        type3 = audioDeviceInfo.getType();
                        if (type2 == type3) {
                            voipAudioHelper.m155539C();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: zm.voip.service.VoipAudioHelper$b */
    /* loaded from: classes7.dex */
    public static final class C32245b implements BluetoothProfile.ServiceListener {
        C32245b() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i11, BluetoothProfile bluetoothProfile) {
            AbstractC19074t.m100208f(bluetoothProfile, "proxy");
            if (VoipAudioHelper.m155581Y()) {
                Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothDevice next = it.next();
                    if (bluetoothProfile.getConnectionState(next) == 2) {
                        VoipAudioHelper.f148773w = next;
                        break;
                    }
                }
            }
            BluetoothAdapter m155558M = VoipAudioHelper.m155558M(VoipAudioHelper.f148751a, null, 1, null);
            if (m155558M != null) {
                m155558M.closeProfileProxy(i11, bluetoothProfile);
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i11) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [zm.voip.service.VoipAudioHelper$receiver$1] */
    static {
        List m131505m;
        List m131496e;
        List m131496e2;
        List m131496e3;
        m131505m = AbstractC25368s.m131505m(3, 4, 22);
        f148752b = m131505m;
        m131496e = AbstractC25366r.m131496e(1);
        f148753c = m131496e;
        m131496e2 = AbstractC25366r.m131496e(2);
        f148754d = m131496e2;
        m131496e3 = AbstractC25366r.m131496e(7);
        f148755e = m131496e3;
        f148760j = -1;
        f148761k = -1;
        f148767q = -2;
        f148768r = new AudioManager.OnAudioFocusChangeListener() { // from class: zm.voip.service.b2
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i11) {
                VoipAudioHelper.m155548H(i11);
            }
        };
        AudioAttributes build = new AudioAttributes.Builder().setUsage(2).build();
        AbstractC19074t.m100207e(build, "build(...)");
        f148769s = build;
        f148774x = new C32245b();
        f148775y = new BroadcastReceiver() { // from class: zm.voip.service.VoipAudioHelper$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String str;
                if (intent != null) {
                    str = intent.getAction();
                } else {
                    str = null;
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    boolean z11 = false;
                    if (hashCode != -1692127708) {
                        if (hashCode != -1676458352) {
                            if (hashCode == 545516589 && str.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                                VoipAudioHelper voipAudioHelper = VoipAudioHelper.f148751a;
                                if (intExtra == 2) {
                                    z11 = true;
                                }
                                voipAudioHelper.m155582Y0(z11);
                                return;
                            }
                            return;
                        }
                        if (str.equals("android.intent.action.HEADSET_PLUG")) {
                            if (intent.getIntExtra("state", 0) == 1) {
                                z11 = true;
                            }
                            VoipAudioHelper.f148751a.m155620s0(z11);
                            return;
                        }
                        return;
                    }
                    if (str.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                        VoipAudioHelper.f148751a.m155606k0(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0), context);
                    }
                }
            }
        };
    }

    private VoipAudioHelper() {
    }

    /* renamed from: A0 */
    private final void m155536A0() {
        f148761k = -1;
        f148760j = -1;
        f148762l = false;
        f148763m = false;
        f148764n = false;
        f148765o = false;
        f148766p = false;
        f148772v = null;
        f148773w = null;
        f148770t = null;
        f148758h = null;
    }

    /* renamed from: B */
    public static final void m155537B(int i11, int i12, int i13) {
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            audioManager.adjustStreamVolume(i11, i12, i13);
        }
    }

    /* renamed from: B0 */
    public static final void m155538B0(int i11) {
        boolean z11;
        AbstractC3082b0.m15424f("VoipAudioHelper", "routeAudioOutput: audioRoute " + i11);
        if (f148761k != i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f148751a.m155547G0();
                }
            } else {
                f148751a.m155563O0();
            }
        } else {
            f148751a.m155555K0();
        }
        if (z11) {
            f148751a.m155632y0();
        } else {
            m155602i0(f148751a, 0L, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final void m155539C() {
        if (m155588b0(false, 1, null)) {
            m155538B0(2);
            return;
        }
        if (m155598g0()) {
            m155538B0(0);
        } else if (f148756f) {
            m155538B0(1);
        } else {
            m155538B0(0);
        }
    }

    /* renamed from: C0 */
    private final void m155540C0() {
        long j11;
        if (!f148763m) {
            f148765o = true;
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zm.voip.service.l2
                @Override // java.lang.Runnable
                public final void run() {
                    VoipAudioHelper.m155542D0();
                }
            });
            return;
        }
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            audioManager.setBluetoothScoOn(true);
            audioManager.setSpeakerphoneOn(false);
        }
        f148761k = 2;
        InterfaceC17929d m94551d = AbstractC17930e.Companion.m94551d();
        Runnable runnable = new Runnable() { // from class: zm.voip.service.m2
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioHelper.m155544E0();
            }
        };
        if (f148773w != null) {
            j11 = 0;
        } else {
            j11 = 200;
        }
        m94551d.mo94531e(runnable, j11);
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.n2
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioHelper.m155545F0();
            }
        });
        m155602i0(this, 0L, 1, null);
    }

    /* renamed from: D */
    private final boolean m155541D() {
        return Build.VERSION.SDK_INT < 34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public static final void m155542D0() {
        try {
            AudioManager audioManager = f148772v;
            if (audioManager != null) {
                audioManager.startBluetoothSco();
            }
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    /* renamed from: E */
    private final void m155543E(Context context) {
        AudioManager audioManager;
        VoipAudioHelper voipAudioHelper;
        BluetoothAdapter m155556L;
        int deviceType;
        try {
            if ((m155581Y() || m155541D()) && (audioManager = f148772v) != null && audioManager.isBluetoothScoAvailableOffCall() && (m155556L = (voipAudioHelper = f148751a).m155556L(context)) != null && m155556L.isEnabled()) {
                boolean z11 = false;
                if (Build.VERSION.SDK_INT >= 24) {
                    Object systemService = context.getSystemService("media_router");
                    AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.MediaRouter");
                    deviceType = ((MediaRouter) systemService).getSelectedRoute(1).getDeviceType();
                    if (deviceType == 3) {
                        if (m155556L.getProfileConnectionState(1) == 2) {
                            z11 = true;
                        }
                        voipAudioHelper.m155582Y0(z11);
                        return;
                    }
                    voipAudioHelper.m155582Y0(false);
                    return;
                }
                if (m155556L.getProfileConnectionState(1) == 2) {
                    z11 = true;
                }
                voipAudioHelper.m155582Y0(z11);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m155544E0() {
        AbstractC32273e3.m155748Q().mo155867b1(104);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public static final void m155545F0() {
        AbstractC17849h.m94303l(false);
    }

    /* renamed from: G */
    private final void m155546G(Context context) {
        try {
            BluetoothAdapter m155556L = m155556L(context);
            if (m155556L != null) {
                m155556L.getProfileProxy(context, f148774x, 1);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: G0 */
    private final void m155547G0() {
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zm.voip.service.h2
                @Override // java.lang.Runnable
                public final void run() {
                    VoipAudioHelper.m155549H0();
                }
            });
        } else {
            m155540C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m155548H(int i11) {
        Integer num;
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            num = Integer.valueOf(audioManager.getMode());
        } else {
            num = null;
        }
        AbstractC3082b0.m15424f("VoipAudioHelper", "Focus changed: " + i11 + " - mode " + num);
        if (i11 == 1) {
            m155571S0(m155554K());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m155549H0() {
        f148751a.m155569R0(f148755e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:            r0 = r0.getAvailableCommunicationDevices();     */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AudioDeviceInfo m155550I(int i11) {
        List availableCommunicationDevices;
        int type;
        AudioManager audioManager = f148772v;
        Object obj = null;
        if (audioManager == null || availableCommunicationDevices == null) {
            return null;
        }
        Iterator it = availableCommunicationDevices.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            type = AbstractC32356v1.m156392a(next).getType();
            if (type == i11) {
                obj = next;
                break;
            }
        }
        return AbstractC32356v1.m156392a(obj);
    }

    /* renamed from: I0 */
    private final void m155551I0() {
        int i11;
        f148765o = false;
        long j11 = 100;
        if (m155588b0(false, 1, null)) {
            if (f148763m || f148764n) {
                f148763m = false;
                f148764n = false;
                j11 = 500;
            }
            AudioManager audioManager = f148772v;
            if (audioManager != null) {
                audioManager.stopBluetoothSco();
            }
            AudioManager audioManager2 = f148772v;
            if (audioManager2 != null) {
                audioManager2.stopBluetoothSco();
            }
        }
        AudioManager audioManager3 = f148772v;
        if (audioManager3 != null) {
            audioManager3.setBluetoothScoOn(false);
        }
        AudioManager audioManager4 = f148772v;
        if (audioManager4 != null) {
            audioManager4.setSpeakerphoneOn(false);
        }
        f148761k = 0;
        m155600h0(j11);
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.s2
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioHelper.m155553J0();
            }
        });
        AbstractC32273e3 m155748Q = AbstractC32273e3.m155748Q();
        if (m155598g0()) {
            i11 = 103;
        } else {
            i11 = 101;
        }
        m155748Q.mo155867b1(i11);
    }

    /* renamed from: J */
    private final AudioFocusRequest m155552J() {
        AudioFocusRequest audioFocusRequest;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        if (f148771u == null) {
            if (AbstractC3103o.m15619h(26)) {
                audioAttributes = AbstractC24655g.m128195a(2).setAudioAttributes(f148769s);
                acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
                onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(f148768r);
                audioFocusRequest = onAudioFocusChangeListener.build();
            } else {
                audioFocusRequest = null;
            }
            f148771u = audioFocusRequest;
        }
        return f148771u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public static final void m155553J0() {
        AbstractC17849h.m94303l(false);
        C17843b.m94137o().m94150M(101);
    }

    /* renamed from: K */
    public static final int m155554K() {
        if (AbstractC32273e3.m155748Q().mo155817K() >= 0) {
            return AbstractC32273e3.m155748Q().mo155817K();
        }
        return 3;
    }

    /* renamed from: K0 */
    private final void m155555K0() {
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zm.voip.service.j2
                @Override // java.lang.Runnable
                public final void run() {
                    VoipAudioHelper.m155557L0();
                }
            });
        } else {
            m155551I0();
        }
    }

    /* renamed from: L */
    private final synchronized BluetoothAdapter m155556L(Context context) {
        if (f148770t == null && context != null) {
            try {
                Object systemService = context.getSystemService("bluetooth");
                AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
                f148770t = ((BluetoothManager) systemService).getAdapter();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return f148770t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m155557L0() {
        if (m155598g0()) {
            f148751a.m155569R0(f148752b);
        } else {
            f148751a.m155569R0(f148753c);
        }
    }

    /* renamed from: M */
    static /* synthetic */ BluetoothAdapter m155558M(VoipAudioHelper voipAudioHelper, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = null;
        }
        return voipAudioHelper.m155556L(context);
    }

    /* renamed from: M0 */
    private final void m155559M0() {
        f148765o = false;
        if (m155588b0(false, 1, null)) {
            if (f148763m || f148764n) {
                f148763m = false;
                f148764n = false;
            }
            AudioManager audioManager = f148772v;
            if (audioManager != null) {
                audioManager.stopBluetoothSco();
            }
            AudioManager audioManager2 = f148772v;
            if (audioManager2 != null) {
                audioManager2.stopBluetoothSco();
            }
        }
        AudioManager audioManager3 = f148772v;
        if (audioManager3 != null) {
            audioManager3.setBluetoothScoOn(false);
        }
        AudioManager audioManager4 = f148772v;
        if (audioManager4 != null) {
            audioManager4.setSpeakerphoneOn(true);
        }
        f148761k = 1;
        m155602i0(this, 0L, 1, null);
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.o2
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioHelper.m155561N0();
            }
        });
        AbstractC32273e3.m155748Q().mo155867b1(102);
    }

    /* renamed from: N */
    public static final String m155560N() {
        String str;
        BluetoothDevice bluetoothDevice = f148773w;
        if (bluetoothDevice != null) {
            str = bluetoothDevice.getName();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m155561N0() {
        AbstractC17849h.m94303l(true);
        C17843b.m94137o().m94150M(102);
    }

    /* renamed from: O */
    public static final int m155562O() {
        BluetoothClass bluetoothClass;
        BluetoothDevice bluetoothDevice = f148773w;
        if (bluetoothDevice != null && (bluetoothClass = bluetoothDevice.getBluetoothClass()) != null) {
            return bluetoothClass.getDeviceClass();
        }
        return -1;
    }

    /* renamed from: O0 */
    private final void m155563O0() {
        if (Build.VERSION.SDK_INT >= 31) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zm.voip.service.k2
                @Override // java.lang.Runnable
                public final void run() {
                    VoipAudioHelper.m155565P0();
                }
            });
        } else {
            m155559M0();
        }
    }

    /* renamed from: P */
    public static final int m155564P() {
        if (m155575V()) {
            return 2;
        }
        if (m155579X()) {
            return 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static final void m155565P0() {
        f148751a.m155569R0(f148754d);
    }

    /* renamed from: Q */
    public static final int m155566Q() {
        if (m155575V()) {
            return 2;
        }
        if (m155579X()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: Q0 */
    private final boolean m155567Q0(int i11) {
        Boolean bool;
        boolean communicationDevice;
        AudioDeviceInfo m155550I = m155550I(i11);
        if (m155550I != null) {
            AudioManager audioManager = f148772v;
            if (audioManager != null) {
                communicationDevice = audioManager.setCommunicationDevice(m155550I);
                bool = Boolean.valueOf(communicationDevice);
                AbstractC3082b0.m15424f("VoipAudioHelper", "route to " + i11 + " - success: " + bool.booleanValue());
            } else {
                bool = null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:            r0 = r0.getCommunicationDevice();     */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AudioDeviceInfo m155568R() {
        AudioDeviceInfo communicationDevice;
        AudioDeviceInfo audioDeviceInfo = f148758h;
        if (audioDeviceInfo == null) {
            AudioManager audioManager = f148772v;
            if (audioManager != null && communicationDevice != null) {
                f148758h = communicationDevice;
                return communicationDevice;
            }
            return null;
        }
        return audioDeviceInfo;
    }

    /* renamed from: R0 */
    private final boolean m155569R0(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (f148751a.m155567Q0(((Number) it.next()).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S */
    public static final int m155570S() {
        int i11;
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            if (m155575V()) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            return audioManager.getStreamVolume(i11);
        }
        return -1;
    }

    /* renamed from: S0 */
    public static final void m155571S0(int i11) {
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            AbstractC3082b0.m15424f("VoipAudioHelper", "setCallModeAudio: " + i11);
            audioManager.setMode(i11);
        }
        f148751a.m155600h0(500L);
    }

    /* renamed from: T */
    public static final int m155572T() {
        int i11;
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            if (m155575V()) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            return audioManager.getStreamMaxVolume(i11);
        }
        return -1;
    }

    /* renamed from: U */
    private final String m155573U(int i11) {
        return i11 != -1 ? i11 != 0 ? i11 != 1 ? i11 != 2 ? "SCO_NOT_DEFINED" : "SCO_CONNECTING" : "SCO_CONNECTED" : "SCO_DISCONNECTED" : "SCO_ERROR";
    }

    /* renamed from: U0 */
    public static final boolean m155574U0() {
        if (f148756f) {
            return true;
        }
        if (m155586a0(true) && AbstractC23309i.m121941ge() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public static final boolean m155575V() {
        int type;
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo m155568R = f148751a.m155568R();
            if (m155568R != null) {
                type = m155568R.getType();
                return f148755e.contains(Integer.valueOf(type));
            }
            return false;
        }
        AudioManager audioManager = f148772v;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isBluetoothScoOn();
    }

    /* renamed from: V0 */
    private final void m155576V0() {
        try {
            AudioManager audioManager = f148772v;
            if (audioManager != null && !f148759i) {
                VoipAudioHelper voipAudioHelper = f148751a;
                audioManager.registerAudioDeviceCallback(voipAudioHelper.m155624u0(), null);
                audioManager.addOnCommunicationDeviceChangedListener(new Executor() { // from class: zm.voip.service.g2
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        VoipAudioHelper.m155578W0(runnable);
                    }
                }, voipAudioHelper.m155626v0());
                f148759i = true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: W */
    public static final boolean m155577W() {
        int type;
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo m155568R = f148751a.m155568R();
            if (m155568R != null) {
                type = m155568R.getType();
                return f148753c.contains(Integer.valueOf(type));
            }
            return false;
        }
        if (m155579X() || m155575V() || m155598g0()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public static final void m155578W0(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: X */
    public static final boolean m155579X() {
        int type;
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo m155568R = f148751a.m155568R();
            if (m155568R != null) {
                type = m155568R.getType();
                return f148754d.contains(Integer.valueOf(type));
            }
            return false;
        }
        AudioManager audioManager = f148772v;
        if (audioManager == null) {
            return false;
        }
        return audioManager.isSpeakerphoneOn();
    }

    /* renamed from: X0 */
    private final void m155580X0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        AbstractC2351i.m12327a(context, f148775y, intentFilter, true);
    }

    /* renamed from: Y */
    public static final boolean m155581Y() {
        if (Build.VERSION.SDK_INT >= 31 && AbstractC3108t.m15712a(AbstractC3096i0.m15574y(), AbstractC23034c6.f112036m) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public final void m155582Y0(boolean z11) {
        AbstractC3082b0.m15424f("VoipAudioHelper", "updateBluetoothHeadsetState: " + z11);
        f148766p = z11;
        if (z11) {
            if (f148763m) {
                AudioManager audioManager = f148772v;
                if (audioManager != null) {
                    audioManager.setSpeakerphoneOn(false);
                    audioManager.setBluetoothScoOn(true);
                }
            } else {
                f148765o = true;
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: zm.voip.service.c2
                    @Override // java.lang.Runnable
                    public final void run() {
                        VoipAudioHelper.m155584Z0();
                    }
                }, 500L);
            }
        } else {
            f148763m = false;
            f148764n = false;
        }
        m155600h0(500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public final boolean m155583Z(int i11) {
        return f148755e.contains(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static final void m155584Z0() {
        try {
            if (!m155581Y()) {
                C23744a.Companion.m124119a().m124116d(40019, new Object[0]);
            }
            AudioManager audioManager = f148772v;
            if (audioManager != null) {
                audioManager.startBluetoothSco();
            }
        } catch (Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    /* renamed from: a0 */
    public static final boolean m155586a0(boolean z11) {
        BluetoothAdapter m155556L;
        if (Build.VERSION.SDK_INT >= 31) {
            List list = f148755e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (f148751a.m155550I(((Number) it.next()).intValue()) != null) {
                        return true;
                    }
                }
            }
        } else {
            if (f148766p) {
                return true;
            }
            if (z11 && m155581Y() && (m155556L = f148751a.m155556L(AbstractC3096i0.m15574y())) != null && m155556L.isEnabled() && m155556L.getProfileConnectionState(1) == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b0 */
    public static /* synthetic */ boolean m155588b0(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m155586a0(z11);
    }

    /* renamed from: c0 */
    private final boolean m155590c0(int i11) {
        return f148753c.contains(Integer.valueOf(i11));
    }

    /* renamed from: d0 */
    public static final boolean m155592d0() {
        if (m155586a0(true) && AbstractC23309i.m121941ge() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private final boolean m155594e0(int i11) {
        return f148754d.contains(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public final boolean m155596f0(int i11) {
        return f148752b.contains(Integer.valueOf(i11));
    }

    /* renamed from: g0 */
    public static final boolean m155598g0() {
        if (Build.VERSION.SDK_INT >= 31) {
            List list = f148752b;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (f148751a.m155550I(((Number) it.next()).intValue()) != null) {
                    return true;
                }
            }
            return false;
        }
        return f148762l;
    }

    /* renamed from: h0 */
    private final void m155600h0(long j11) {
        AbstractC17930e.Companion.m94551d().mo94530d("notifyAudioStateChanged", new Runnable() { // from class: zm.voip.service.e2
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioHelper.m155604j0();
            }
        }, j11);
    }

    /* renamed from: i0 */
    static /* synthetic */ void m155602i0(VoipAudioHelper voipAudioHelper, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 100;
        }
        voipAudioHelper.m155600h0(j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m155604j0() {
        C23744a.Companion.m124119a().m124116d(40014, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m155606k0(int i11, Context context) {
        boolean z11;
        boolean z12;
        VoipAudioHelper voipAudioHelper;
        BluetoothAdapter m155556L;
        int i12;
        try {
            AbstractC3082b0.m15424f("VoipAudioHelper", "onBluetoothSCOStateChanged: " + m155573U(i11));
            if (i11 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            f148764n = z11;
            if (i11 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            f148763m = z12;
            if (z12) {
                f148766p = true;
                if (context != null) {
                    f148751a.m155546G(context);
                }
                if (m155575V()) {
                    f148761k = 2;
                }
                if (f148765o) {
                    f148765o = false;
                    m155538B0(2);
                }
            } else if (!z11) {
                if (f148761k == 2) {
                    if (!m155598g0() && f148756f) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    m155538B0(i12);
                }
                if (m155588b0(false, 1, null) && context != null && (m155556L = (voipAudioHelper = f148751a).m155556L(context)) != null && (!m155556L.isEnabled() || m155556L.getProfileConnectionState(1) != 2)) {
                    voipAudioHelper.m155582Y0(false);
                }
            }
            m155600h0(200L);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: l0 */
    private final void m155608l0(AudioDeviceInfo audioDeviceInfo) {
        Integer num;
        int type;
        int type2;
        int type3;
        int type4;
        boolean isSink;
        int type5;
        Boolean bool = null;
        if (audioDeviceInfo != null) {
            type5 = audioDeviceInfo.getType();
            num = Integer.valueOf(type5);
        } else {
            num = null;
        }
        if (audioDeviceInfo != null) {
            isSink = audioDeviceInfo.isSink();
            bool = Boolean.valueOf(isSink);
        }
        AbstractC3082b0.m15424f("VoipAudioHelper", "OnCommunicationDeviceChangedListener " + num + " - " + bool);
        f148758h = audioDeviceInfo;
        if (audioDeviceInfo != null) {
            VoipAudioHelper voipAudioHelper = f148751a;
            type = audioDeviceInfo.getType();
            if (!voipAudioHelper.m155590c0(type)) {
                type2 = audioDeviceInfo.getType();
                if (!voipAudioHelper.m155596f0(type2)) {
                    type3 = audioDeviceInfo.getType();
                    if (!voipAudioHelper.m155583Z(type3)) {
                        type4 = audioDeviceInfo.getType();
                        if (voipAudioHelper.m155594e0(type4)) {
                            f148761k = 1;
                            HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.r2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    VoipAudioHelper.m155614o0();
                                }
                            });
                            AbstractC32273e3.m155748Q().mo155867b1(102);
                        }
                    } else {
                        f148761k = 2;
                        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.q2
                            @Override // java.lang.Runnable
                            public final void run() {
                                VoipAudioHelper.m155612n0();
                            }
                        });
                        AbstractC32273e3.m155748Q().mo155867b1(104);
                    }
                }
            }
            f148761k = 0;
            HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.p2
                @Override // java.lang.Runnable
                public final void run() {
                    VoipAudioHelper.m155610m0();
                }
            });
            AbstractC32273e3.m155748Q().mo155867b1(101);
        }
        m155600h0(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m155610m0() {
        AbstractC17849h.m94303l(false);
        C17843b.m94137o().m94150M(101);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m155612n0() {
        AbstractC17849h.m94303l(false);
        C17843b.m94137o().m94150M(104);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static final void m155614o0() {
        AbstractC17849h.m94303l(true);
        C17843b.m94137o().m94150M(102);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r0 */
    public static final void m155618r0() {
        VoipAudioHelper voipAudioHelper = f148751a;
        voipAudioHelper.m155630x0();
        voipAudioHelper.m155536A0();
    }

    /* renamed from: s */
    private final void m155619s() {
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            if (AbstractC3103o.m15619h(26)) {
                AudioFocusRequest m155552J = f148751a.m155552J();
                if (m155552J != null) {
                    audioManager.abandonAudioFocusRequest(m155552J);
                    return;
                }
                return;
            }
            audioManager.abandonAudioFocus(f148768r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public final void m155620s0(boolean z11) {
        int i11;
        AbstractC3082b0.m15424f("VoipAudioHelper", "onWiredHeadsetAction: " + z11);
        f148762l = z11;
        if (z11) {
            if (m155579X()) {
                i11 = 1;
            } else if (m155575V()) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            f148760j = i11;
            m155538B0(0);
            return;
        }
        if (f148760j != -1 && !m155575V()) {
            m155538B0(f148760j);
            f148760j = -1;
        }
    }

    /* renamed from: t0 */
    private final void m155622t0() {
        AudioManager audioManager = f148772v;
        if (audioManager != null) {
            if (AbstractC3103o.m15619h(26)) {
                AudioFocusRequest m155552J = f148751a.m155552J();
                if (m155552J != null) {
                    audioManager.requestAudioFocus(m155552J);
                    return;
                }
                return;
            }
            audioManager.requestAudioFocus(f148768r, AbstractC3103o.m15616e(), 2);
        }
    }

    /* renamed from: u0 */
    private final AudioDeviceCallback m155624u0() {
        if (f148776z == null) {
            f148776z = AbstractC32371y1.m156440a(new C32244a());
        }
        AudioDeviceCallback audioDeviceCallback = f148776z;
        AbstractC19074t.m100206d(audioDeviceCallback, "null cannot be cast to non-null type android.media.AudioDeviceCallback");
        return audioDeviceCallback;
    }

    /* renamed from: v0 */
    private final AudioManager.OnCommunicationDeviceChangedListener m155626v0() {
        if (f148750A == null) {
            f148750A = new AudioManager.OnCommunicationDeviceChangedListener() { // from class: zm.voip.service.i2
                @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
                public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
                    VoipAudioHelper.m155628w0(audioDeviceInfo);
                }
            };
        }
        AudioManager.OnCommunicationDeviceChangedListener onCommunicationDeviceChangedListener = f148750A;
        AbstractC19074t.m100206d(onCommunicationDeviceChangedListener, "null cannot be cast to non-null type android.media.AudioManager.OnCommunicationDeviceChangedListener");
        return onCommunicationDeviceChangedListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m155628w0(AudioDeviceInfo audioDeviceInfo) {
        f148751a.m155608l0(audioDeviceInfo);
    }

    /* renamed from: x0 */
    private final void m155630x0() {
        int i11;
        AudioManager audioManager = f148772v;
        if (audioManager != null && (i11 = f148767q) != -2) {
            if (i11 != 2 && i11 != 3) {
                audioManager.setMode(f148767q);
            } else {
                audioManager.setMode(0);
            }
        }
    }

    /* renamed from: y0 */
    private final void m155632y0() {
        if (!AbstractC32273e3.m155748Q().m155890j2()) {
            return;
        }
        HandlerC32324p.m156351d(new Runnable() { // from class: zm.voip.service.f2
            @Override // java.lang.Runnable
            public final void run() {
                VoipAudioHelper.m155634z0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m155634z0() {
        AbstractC32273e3.m155748Q().m155812I1();
    }

    /* renamed from: F */
    public final void m155635F(Context context) {
        AbstractC19074t.m100208f(context, "context");
        if (!f148757g) {
            if (Build.VERSION.SDK_INT < 31) {
                m155543E(context);
            }
            m155539C();
        }
    }

    /* renamed from: T0 */
    public final void m155636T0(boolean z11) {
        f148756f = z11;
    }

    /* renamed from: p0 */
    public final void m155637p0(Context context, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(context, "context");
        try {
            m155536A0();
            f148756f = z11;
            f148757g = z12;
            m155546G(context);
            Object systemService = context.getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            f148772v = (AudioManager) systemService;
            int i11 = Build.VERSION.SDK_INT;
            boolean z13 = true;
            if (i11 >= 31) {
                m155576V0();
                if (!z12) {
                    m155569R0(f148753c);
                }
            } else {
                m155580X0(context);
                AudioManager audioManager = f148772v;
                if (audioManager != null) {
                    if (!audioManager.isWiredHeadsetOn()) {
                        z13 = false;
                    }
                    f148762l = z13;
                    audioManager.setMicrophoneMute(false);
                    audioManager.setSpeakerphoneOn(false);
                }
            }
            AudioManager audioManager2 = f148772v;
            if (audioManager2 != null) {
                f148767q = audioManager2.getMode();
                if (z12) {
                    m155571S0(m155554K());
                }
            }
            f148761k = z11 ? 1 : 0;
            if (z12) {
                if (i11 < 31) {
                    m155543E(context);
                }
                m155539C();
            }
            m155622t0();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q0 */
    public final void m155638q0(Context context) {
        AudioManager audioManager;
        AbstractC19074t.m100208f(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                AudioManager audioManager2 = f148772v;
                if (audioManager2 != null) {
                    audioManager2.clearCommunicationDevice();
                }
                if (f148759i) {
                    AudioManager audioManager3 = f148772v;
                    if (audioManager3 != null) {
                        audioManager3.unregisterAudioDeviceCallback(m155624u0());
                    }
                    AudioManager audioManager4 = f148772v;
                    if (audioManager4 != null) {
                        audioManager4.removeOnCommunicationDeviceChangedListener(m155626v0());
                    }
                    f148759i = false;
                    f148776z = null;
                    f148750A = null;
                }
            } else {
                if ((m155588b0(false, 1, null) || f148763m || f148764n) && (audioManager = f148772v) != null) {
                    audioManager.stopBluetoothSco();
                    audioManager.stopBluetoothSco();
                    audioManager.setBluetoothScoOn(false);
                }
                context.unregisterReceiver(f148775y);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        try {
            m155619s();
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: zm.voip.service.d2
                @Override // java.lang.Runnable
                public final void run() {
                    VoipAudioHelper.m155618r0();
                }
            });
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }
}
