package p221hy;

import android.content.Context;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: hy.a */
/* loaded from: classes.dex */
public interface InterfaceC20165a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: hy.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: p */
        public static final a f99531p = new a("FIREBASE", 0);

        /* renamed from: q */
        public static final a f99532q = new a("HUAWEI", 1);

        /* renamed from: r */
        public static final a f99533r = new a(Image.SCALE_TYPE_NONE, 2);

        /* renamed from: s */
        private static final /* synthetic */ a[] f99534s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f99535t;

        static {
            a[] m105148b = m105148b();
            f99534s = m105148b;
            f99535t = AbstractC30166b.m148796a(m105148b);
        }

        private a(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m105148b() {
            return new a[]{f99531p, f99532q, f99533r};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f99534s.clone();
        }
    }

    /* renamed from: a */
    void mo103257a(Context context);

    /* renamed from: b */
    String mo103258b(Context context);

    /* renamed from: c */
    void mo103259c(Context context);

    /* renamed from: d */
    void mo103260d(Context context);

    /* renamed from: e */
    void mo103261e(Context context);

    a getType();
}
