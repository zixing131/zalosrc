package if0;

import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: if0.q */
/* loaded from: classes5.dex */
public interface InterfaceC20544q {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: if0.q$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f100884p = new a("UNKNOWN", 0);

        /* renamed from: q */
        public static final a f100885q = new a("FORMAT_NOT_SUPPORTED", 1);

        /* renamed from: r */
        public static final a f100886r = new a("LOCAL_FILE_NOT_FOUND", 2);

        /* renamed from: s */
        public static final a f100887s = new a("NO_NETWORK", 3);

        /* renamed from: t */
        public static final a f100888t = new a("NO_VOICE_RECOGNIZED", 4);

        /* renamed from: u */
        public static final a f100889u = new a("UPLOADING", 5);

        /* renamed from: v */
        private static final /* synthetic */ a[] f100890v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f100891w;

        static {
            a[] m106749b = m106749b();
            f100890v = m106749b;
            f100891w = AbstractC30166b.m148796a(m106749b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m106749b() {
            return new a[]{f100884p, f100885q, f100886r, f100887s, f100888t, f100889u};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f100890v.clone();
        }
    }

    /* renamed from: a */
    void mo106674a(a aVar);

    /* renamed from: b */
    void mo106675b();

    void onSuccess(String str);
}
