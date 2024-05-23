package qa;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzse;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsg;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p012a6.AbstractC0615z0;
import p012a6.InterfaceC0428oh;
import pa.AbstractC24702b;
import qa.C25202a;

/* renamed from: qa.a */
/* loaded from: classes3.dex */
public class C25202a {

    /* renamed from: a */
    private final List f120947a;

    /* renamed from: b */
    private final String f120948b;

    /* renamed from: qa.a$c */
    /* loaded from: classes3.dex */
    public static class c extends d {

        /* renamed from: e */
        private final float f120955e;

        /* renamed from: f */
        private final float f120956f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(zzsk zzskVar, Matrix matrix) {
            super(zzskVar.m30150K(), zzskVar.m30149J(), zzskVar.m30151M(), "", matrix);
            this.f120955e = zzskVar.m30148F();
            this.f120956f = zzskVar.m30152t();
        }
    }

    /* renamed from: qa.a$d */
    /* loaded from: classes3.dex */
    static class d {

        /* renamed from: a */
        private final String f120957a;

        /* renamed from: b */
        private final Rect f120958b;

        /* renamed from: c */
        private final Point[] f120959c;

        /* renamed from: d */
        private final String f120960d;

        d(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f120957a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                AbstractC24702b.m128274c(rect2, matrix);
            }
            this.f120958b = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                pointArr[i11] = new Point((Point) list.get(i11));
            }
            if (matrix != null) {
                AbstractC24702b.m128273b(pointArr, matrix);
            }
            this.f120959c = pointArr;
            this.f120960d = str2;
        }

        /* renamed from: a */
        public Rect mo130448a() {
            return this.f120958b;
        }

        /* renamed from: b */
        public Point[] mo130449b() {
            return this.f120959c;
        }

        /* renamed from: c */
        public String mo130450c() {
            return this.f120960d;
        }

        /* renamed from: d */
        protected final String m130453d() {
            String str = this.f120957a;
            return str == null ? "" : str;
        }
    }

    public C25202a(zzsg zzsgVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f120947a = arrayList;
        this.f120948b = zzsgVar.m30147t();
        arrayList.addAll(AbstractC0615z0.m903a(zzsgVar.m30146F(), new InterfaceC0428oh() { // from class: qa.e
            @Override // p012a6.InterfaceC0428oh
            public final Object zza(Object obj) {
                return new C25202a.e((zzsa) obj, matrix);
            }
        }));
    }

    /* renamed from: a */
    public List m130447a() {
        return Collections.unmodifiableList(this.f120947a);
    }

    public C25202a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f120947a = arrayList;
        arrayList.addAll(list);
        this.f120948b = str;
    }

    /* renamed from: qa.a$b */
    /* loaded from: classes3.dex */
    public static class b extends d {

        /* renamed from: e */
        private final List f120952e;

        /* renamed from: f */
        private final float f120953f;

        /* renamed from: g */
        private final float f120954g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(zzse zzseVar, final Matrix matrix, float f11, float f12) {
            super(zzseVar.m30142M(), zzseVar.m30140J(), zzseVar.m30143Q(), zzseVar.m30141K(), matrix);
            this.f120952e = AbstractC0615z0.m903a(zzseVar.m30144Z(), new InterfaceC0428oh() { // from class: qa.g
                @Override // p012a6.InterfaceC0428oh
                public final Object zza(Object obj) {
                    return new C25202a.a((zzsc) obj, matrix);
                }
            });
            this.f120953f = f11;
            this.f120954g = f12;
        }

        @Override // qa.C25202a.d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Rect mo130448a() {
            return super.mo130448a();
        }

        @Override // qa.C25202a.d
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Point[] mo130449b() {
            return super.mo130449b();
        }

        @Override // qa.C25202a.d
        /* renamed from: c */
        public /* bridge */ /* synthetic */ String mo130450c() {
            return super.mo130450c();
        }

        /* renamed from: e */
        public float m130451e() {
            return this.f120953f;
        }

        /* renamed from: f */
        public String m130452f() {
            return m130453d();
        }

        public b(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f11, float f12) {
            super(str, rect, list, str2, matrix);
            this.f120952e = list2;
            this.f120953f = f11;
            this.f120954g = f12;
        }
    }

    /* renamed from: qa.a$e */
    /* loaded from: classes3.dex */
    public static class e extends d {

        /* renamed from: e */
        private final List f120961e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e(zzsa zzsaVar, final Matrix matrix) {
            super(zzsaVar.m30128J(), zzsaVar.m30131t(), zzsaVar.m30129K(), zzsaVar.m30127F(), matrix);
            this.f120961e = AbstractC0615z0.m903a(zzsaVar.m30130M(), new InterfaceC0428oh() { // from class: qa.h
                @Override // p012a6.InterfaceC0428oh
                public final Object zza(Object obj) {
                    zzse zzseVar = (zzse) obj;
                    return new C25202a.b(zzseVar, matrix, zzseVar.m30139F(), zzseVar.m30145t());
                }
            });
        }

        /* renamed from: e */
        public synchronized List m130454e() {
            return this.f120961e;
        }

        /* renamed from: f */
        public String m130455f() {
            return m130453d();
        }

        public e(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.f120961e = list2;
        }
    }

    /* renamed from: qa.a$a */
    /* loaded from: classes3.dex */
    public static class a extends d {

        /* renamed from: e */
        private final List f120949e;

        /* renamed from: f */
        private final float f120950f;

        /* renamed from: g */
        private final float f120951g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(zzsc zzscVar, final Matrix matrix) {
            super(zzscVar.m30135M(), zzscVar.m30133J(), zzscVar.m30136Q(), zzscVar.m30134K(), matrix);
            this.f120950f = zzscVar.m30132F();
            this.f120951g = zzscVar.m30138t();
            List m30137Z = zzscVar.m30137Z();
            this.f120949e = AbstractC0615z0.m903a(m30137Z == null ? new ArrayList() : m30137Z, new InterfaceC0428oh() { // from class: qa.f
                @Override // p012a6.InterfaceC0428oh
                public final Object zza(Object obj) {
                    return new C25202a.c((zzsk) obj, matrix);
                }
            });
        }

        public a(String str, Rect rect, List list, String str2, Matrix matrix, float f11, float f12, List list2) {
            super(str, rect, list, str2, matrix);
            this.f120950f = f11;
            this.f120951g = f12;
            this.f120949e = list2;
        }
    }
}
