package q20;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import fn0.AbstractC19074t;

/* renamed from: q20.d */
/* loaded from: classes5.dex */
public final class C25081d {

    /* renamed from: a */
    public static final C25081d f120480a = new C25081d();

    private C25081d() {
    }

    /* renamed from: a */
    private final AudioManager m130008a(Context context) {
        Object obj;
        if (context != null) {
            obj = context.getSystemService("audio");
        } else {
            obj = null;
        }
        if (!(obj instanceof AudioManager)) {
            return null;
        }
        return (AudioManager) obj;
    }

    /* renamed from: b */
    public final boolean m130009b(Context context) {
        AudioDeviceInfo[] devices;
        int type;
        int type2;
        AudioManager m130008a = m130008a(context);
        if (m130008a == null) {
            return false;
        }
        if (C25078a.f120479a.m129999a()) {
            devices = m130008a.getDevices(2);
            AbstractC19074t.m100205c(devices);
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                type = audioDeviceInfo.getType();
                if (type != 7) {
                    type2 = audioDeviceInfo.getType();
                    if (type2 != 8) {
                    }
                }
                return true;
            }
            return false;
        }
        if (!m130008a.isBluetoothScoOn() && !m130008a.isBluetoothA2dpOn()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m130010c(Context context) {
        AudioDeviceInfo[] devices;
        int type;
        int type2;
        int type3;
        AudioManager m130008a = m130008a(context);
        if (m130008a != null) {
            if (C25078a.f120479a.m129999a()) {
                devices = m130008a.getDevices(2);
                AbstractC19074t.m100205c(devices);
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    type = audioDeviceInfo.getType();
                    if (type != 22) {
                        type2 = audioDeviceInfo.getType();
                        if (type2 != 3) {
                            type3 = audioDeviceInfo.getType();
                            if (type3 == 4) {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                return m130008a.isWiredHeadsetOn();
            }
        }
        return false;
    }
}
