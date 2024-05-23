package p234ia;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p122e5.AbstractC18201b;
import p122e5.C18203d;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22880f;
import p633x5.AbstractC29356m;
import p633x5.AbstractC29362p;
import p633x5.C29360o;
import p669y4.InterfaceC30285b;

/* renamed from: ia.l */
/* loaded from: classes3.dex */
public abstract class AbstractC20469l {

    /* renamed from: a */
    public static final Feature[] f100676a = new Feature[0];

    /* renamed from: b */
    public static final Feature f100677b;

    /* renamed from: c */
    public static final Feature f100678c;

    /* renamed from: d */
    public static final Feature f100679d;

    /* renamed from: e */
    public static final Feature f100680e;

    /* renamed from: f */
    public static final Feature f100681f;

    /* renamed from: g */
    public static final Feature f100682g;

    /* renamed from: h */
    public static final Feature f100683h;

    /* renamed from: i */
    public static final Feature f100684i;

    /* renamed from: j */
    public static final Feature f100685j;

    /* renamed from: k */
    public static final Feature f100686k;

    /* renamed from: l */
    public static final Feature f100687l;

    /* renamed from: m */
    public static final Feature f100688m;

    /* renamed from: n */
    public static final Feature f100689n;

    /* renamed from: o */
    public static final Feature f100690o;

    /* renamed from: p */
    public static final Feature f100691p;

    /* renamed from: q */
    public static final Feature f100692q;

    /* renamed from: r */
    public static final Feature f100693r;

    /* renamed from: s */
    public static final Feature f100694s;

    /* renamed from: t */
    public static final Feature f100695t;

    /* renamed from: u */
    public static final Feature f100696u;

    /* renamed from: v */
    public static final Feature f100697v;

    /* renamed from: w */
    private static final AbstractC29362p f100698w;

    /* renamed from: x */
    private static final AbstractC29362p f100699x;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f100677b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f100678c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f100679d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f100680e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f100681f = feature5;
        f100682g = new Feature("mlkit.ocr.chinese", 1L);
        f100683h = new Feature("mlkit.ocr.common", 1L);
        f100684i = new Feature("mlkit.ocr.devanagari", 1L);
        f100685j = new Feature("mlkit.ocr.japanese", 1L);
        f100686k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f100687l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f100688m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f100689n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f100690o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f100691p = feature10;
        f100692q = new Feature("mlkit.image.caption", 1L);
        f100693r = new Feature("mlkit.docscan.detect", 1L);
        f100694s = new Feature("mlkit.docscan.crop", 1L);
        f100695t = new Feature("mlkit.docscan.enhance", 1L);
        f100696u = new Feature("mlkit.quality.aesthetic", 1L);
        f100697v = new Feature("mlkit.quality.technical", 1L);
        C29360o c29360o = new C29360o();
        c29360o.m146501a("barcode", feature);
        c29360o.m146501a("custom_ica", feature2);
        c29360o.m146501a("face", feature3);
        c29360o.m146501a("ica", feature4);
        c29360o.m146501a("ocr", feature5);
        c29360o.m146501a("langid", feature6);
        c29360o.m146501a("nlclassifier", feature7);
        c29360o.m146501a("tflite_dynamite", feature8);
        c29360o.m146501a("barcode_ui", feature9);
        c29360o.m146501a("smart_reply", feature10);
        f100698w = c29360o.m146502b();
        C29360o c29360o2 = new C29360o();
        c29360o2.m146501a("com.google.android.gms.vision.barcode", feature);
        c29360o2.m146501a("com.google.android.gms.vision.custom.ica", feature2);
        c29360o2.m146501a("com.google.android.gms.vision.face", feature3);
        c29360o2.m146501a("com.google.android.gms.vision.ica", feature4);
        c29360o2.m146501a("com.google.android.gms.vision.ocr", feature5);
        c29360o2.m146501a("com.google.android.gms.mlkit.langid", feature6);
        c29360o2.m146501a("com.google.android.gms.mlkit.nlclassifier", feature7);
        c29360o2.m146501a("com.google.android.gms.tflite_dynamite", feature8);
        c29360o2.m146501a("com.google.android.gms.mlkit_smartreply", feature10);
        f100699x = c29360o2.m146502b();
    }

    /* renamed from: a */
    public static boolean m106509a(Context context, List list) {
        if (C4148b.m19567h().m19569b(context) >= 221500000) {
            return m106510b(context, m106514f(f100699x, list));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.m19920e(context, DynamiteModule.f16815b, (String) it.next());
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m106510b(Context context, final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) AbstractC22894m.m117599a(AbstractC18201b.m97005a(context).mo19842c(new InterfaceC30285b() { // from class: ia.a0
                @Override // p669y4.InterfaceC30285b
                /* renamed from: b */
                public final Feature[] mo34569b() {
                    Feature[] featureArr2 = featureArr;
                    Feature[] featureArr3 = AbstractC20469l.f100676a;
                    return featureArr2;
                }
            }).mo117576e(new InterfaceC22880f() { // from class: ia.b0
                @Override // p342m6.InterfaceC22880f
                /* renamed from: b */
                public final void mo839b(Exception exc) {
                }
            }))).m19829t();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static void m106511c(Context context, String str) {
        m106512d(context, AbstractC29356m.m146496m(str));
    }

    /* renamed from: d */
    public static void m106512d(Context context, List list) {
        if (C4148b.m19567h().m19569b(context) >= 221500000) {
            m106513e(context, m106514f(f100698w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    /* renamed from: e */
    public static void m106513e(Context context, final Feature[] featureArr) {
        AbstractC18201b.m97005a(context).mo19841b(C18203d.m97006d().m97011a(new InterfaceC30285b() { // from class: ia.c0
            @Override // p669y4.InterfaceC30285b
            /* renamed from: b */
            public final Feature[] mo34569b() {
                Feature[] featureArr2 = featureArr;
                Feature[] featureArr3 = AbstractC20469l.f100676a;
                return featureArr2;
            }
        }).m97012b()).mo117576e(new InterfaceC22880f() { // from class: ia.d0
            @Override // p342m6.InterfaceC22880f
            /* renamed from: b */
            public final void mo839b(Exception exc) {
            }
        });
    }

    /* renamed from: f */
    private static Feature[] m106514f(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            featureArr[i11] = (Feature) AbstractC4205o.m19722k((Feature) map.get(list.get(i11)));
        }
        return featureArr;
    }
}
