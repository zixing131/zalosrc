package androidx.media;

import android.util.SparseIntArray;
import com.zing.zalo.zinstant.zom.node.ZOM;
import p312l2.InterfaceC22005a;

/* loaded from: classes2.dex */
public class AudioAttributesCompat implements InterfaceC22005a {

    /* renamed from: b */
    private static final SparseIntArray f7450b;

    /* renamed from: c */
    private static final int[] f7451c;

    /* renamed from: a */
    AudioAttributesImpl f7452a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7450b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f7451c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m9443a(boolean z11, int i11, int i12) {
        if ((i11 & 1) == 1) {
            if (z11) {
                return 1;
            }
            return 7;
        }
        if ((i11 & 4) == 4) {
            if (z11) {
                return 0;
            }
            return 6;
        }
        switch (i12) {
            case 0:
                if (!z11) {
                    return 3;
                }
                return Integer.MIN_VALUE;
            case 1:
            case 12:
            case 14:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return 3;
            case 2:
                return 0;
            case 3:
                if (z11) {
                    return 0;
                }
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z11) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i12 + " in audio attributes");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m9444b(int i11) {
        switch (i11) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i11;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f7452a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f7452a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f7452a);
    }

    public int hashCode() {
        return this.f7452a.hashCode();
    }

    public String toString() {
        return this.f7452a.toString();
    }
}
