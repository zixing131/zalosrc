package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.AbstractC1261a;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007a1.C0022c;
import p045c1.C3186e;
import p045c1.C3191j;

/* renamed from: androidx.constraintlayout.widget.c */
/* loaded from: classes2.dex */
public class C1295c {

    /* renamed from: h */
    private static final int[] f5629h = {0, 4, 8};

    /* renamed from: i */
    private static SparseIntArray f5630i = new SparseIntArray();

    /* renamed from: j */
    private static SparseIntArray f5631j = new SparseIntArray();

    /* renamed from: a */
    private boolean f5632a;

    /* renamed from: b */
    public String f5633b;

    /* renamed from: c */
    public String f5634c = "";

    /* renamed from: d */
    public int f5635d = 0;

    /* renamed from: e */
    private HashMap f5636e = new HashMap();

    /* renamed from: f */
    private boolean f5637f = true;

    /* renamed from: g */
    private HashMap f5638g = new HashMap();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        int f5639a;

        /* renamed from: b */
        String f5640b;

        /* renamed from: c */
        public final d f5641c = new d();

        /* renamed from: d */
        public final c f5642d = new c();

        /* renamed from: e */
        public final b f5643e = new b();

        /* renamed from: f */
        public final e f5644f = new e();

        /* renamed from: g */
        public HashMap f5645g = new HashMap();

        /* renamed from: h */
        C32623a f5646h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a */
        /* loaded from: classes2.dex */
        public static class C32623a {

            /* renamed from: a */
            int[] f5647a = new int[10];

            /* renamed from: b */
            int[] f5648b = new int[10];

            /* renamed from: c */
            int f5649c = 0;

            /* renamed from: d */
            int[] f5650d = new int[10];

            /* renamed from: e */
            float[] f5651e = new float[10];

            /* renamed from: f */
            int f5652f = 0;

            /* renamed from: g */
            int[] f5653g = new int[5];

            /* renamed from: h */
            String[] f5654h = new String[5];

            /* renamed from: i */
            int f5655i = 0;

            /* renamed from: j */
            int[] f5656j = new int[4];

            /* renamed from: k */
            boolean[] f5657k = new boolean[4];

            /* renamed from: l */
            int f5658l = 0;

            C32623a() {
            }

            /* renamed from: a */
            void m6473a(int i11, float f11) {
                int i12 = this.f5652f;
                int[] iArr = this.f5650d;
                if (i12 >= iArr.length) {
                    this.f5650d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f5651e;
                    this.f5651e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f5650d;
                int i13 = this.f5652f;
                iArr2[i13] = i11;
                float[] fArr2 = this.f5651e;
                this.f5652f = i13 + 1;
                fArr2[i13] = f11;
            }

            /* renamed from: b */
            void m6474b(int i11, int i12) {
                int i13 = this.f5649c;
                int[] iArr = this.f5647a;
                if (i13 >= iArr.length) {
                    this.f5647a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f5648b;
                    this.f5648b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f5647a;
                int i14 = this.f5649c;
                iArr3[i14] = i11;
                int[] iArr4 = this.f5648b;
                this.f5649c = i14 + 1;
                iArr4[i14] = i12;
            }

            /* renamed from: c */
            void m6475c(int i11, String str) {
                int i12 = this.f5655i;
                int[] iArr = this.f5653g;
                if (i12 >= iArr.length) {
                    this.f5653g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f5654h;
                    this.f5654h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f5653g;
                int i13 = this.f5655i;
                iArr2[i13] = i11;
                String[] strArr2 = this.f5654h;
                this.f5655i = i13 + 1;
                strArr2[i13] = str;
            }

            /* renamed from: d */
            void m6476d(int i11, boolean z11) {
                int i12 = this.f5658l;
                int[] iArr = this.f5656j;
                if (i12 >= iArr.length) {
                    this.f5656j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f5657k;
                    this.f5657k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f5656j;
                int i13 = this.f5658l;
                iArr2[i13] = i11;
                boolean[] zArr2 = this.f5657k;
                this.f5658l = i13 + 1;
                zArr2[i13] = z11;
            }

            /* renamed from: e */
            void m6477e(a aVar) {
                for (int i11 = 0; i11 < this.f5649c; i11++) {
                    C1295c.m6426O(aVar, this.f5647a[i11], this.f5648b[i11]);
                }
                for (int i12 = 0; i12 < this.f5652f; i12++) {
                    C1295c.m6425N(aVar, this.f5650d[i12], this.f5651e[i12]);
                }
                for (int i13 = 0; i13 < this.f5655i; i13++) {
                    C1295c.m6427P(aVar, this.f5653g[i13], this.f5654h[i13]);
                }
                for (int i14 = 0; i14 < this.f5658l; i14++) {
                    C1295c.m6428Q(aVar, this.f5656j[i14], this.f5657k[i14]);
                }
            }
        }

        /* renamed from: g */
        public void m6467g(int i11, ConstraintLayout.LayoutParams layoutParams) {
            this.f5639a = i11;
            b bVar = this.f5643e;
            bVar.f5704j = layoutParams.f5521e;
            bVar.f5706k = layoutParams.f5523f;
            bVar.f5708l = layoutParams.f5525g;
            bVar.f5710m = layoutParams.f5527h;
            bVar.f5712n = layoutParams.f5529i;
            bVar.f5714o = layoutParams.f5531j;
            bVar.f5716p = layoutParams.f5533k;
            bVar.f5718q = layoutParams.f5535l;
            bVar.f5720r = layoutParams.f5537m;
            bVar.f5721s = layoutParams.f5539n;
            bVar.f5722t = layoutParams.f5541o;
            bVar.f5723u = layoutParams.f5549s;
            bVar.f5724v = layoutParams.f5551t;
            bVar.f5725w = layoutParams.f5553u;
            bVar.f5726x = layoutParams.f5555v;
            bVar.f5727y = layoutParams.f5493G;
            bVar.f5728z = layoutParams.f5494H;
            bVar.f5660A = layoutParams.f5495I;
            bVar.f5661B = layoutParams.f5543p;
            bVar.f5662C = layoutParams.f5545q;
            bVar.f5663D = layoutParams.f5547r;
            bVar.f5664E = layoutParams.f5510X;
            bVar.f5665F = layoutParams.f5511Y;
            bVar.f5666G = layoutParams.f5512Z;
            bVar.f5700h = layoutParams.f5517c;
            bVar.f5696f = layoutParams.f5513a;
            bVar.f5698g = layoutParams.f5515b;
            bVar.f5692d = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            bVar.f5694e = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            bVar.f5667H = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            bVar.f5668I = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            bVar.f5669J = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            bVar.f5670K = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            bVar.f5673N = layoutParams.f5490D;
            bVar.f5681V = layoutParams.f5499M;
            bVar.f5682W = layoutParams.f5498L;
            bVar.f5684Y = layoutParams.f5501O;
            bVar.f5683X = layoutParams.f5500N;
            bVar.f5713n0 = layoutParams.f5514a0;
            bVar.f5715o0 = layoutParams.f5516b0;
            bVar.f5685Z = layoutParams.f5502P;
            bVar.f5687a0 = layoutParams.f5503Q;
            bVar.f5689b0 = layoutParams.f5506T;
            bVar.f5691c0 = layoutParams.f5507U;
            bVar.f5693d0 = layoutParams.f5504R;
            bVar.f5695e0 = layoutParams.f5505S;
            bVar.f5697f0 = layoutParams.f5508V;
            bVar.f5699g0 = layoutParams.f5509W;
            bVar.f5711m0 = layoutParams.f5518c0;
            bVar.f5675P = layoutParams.f5559x;
            bVar.f5677R = layoutParams.f5561z;
            bVar.f5674O = layoutParams.f5557w;
            bVar.f5676Q = layoutParams.f5560y;
            bVar.f5679T = layoutParams.f5487A;
            bVar.f5678S = layoutParams.f5488B;
            bVar.f5680U = layoutParams.f5489C;
            bVar.f5719q0 = layoutParams.f5520d0;
            bVar.f5671L = layoutParams.getMarginEnd();
            this.f5643e.f5672M = layoutParams.getMarginStart();
        }

        /* renamed from: h */
        public void m6468h(int i11, Constraints.LayoutParams layoutParams) {
            m6467g(i11, layoutParams);
            this.f5641c.f5747d = layoutParams.f5583x0;
            e eVar = this.f5644f;
            eVar.f5751b = layoutParams.f5573A0;
            eVar.f5752c = layoutParams.f5574B0;
            eVar.f5753d = layoutParams.f5575C0;
            eVar.f5754e = layoutParams.f5576D0;
            eVar.f5755f = layoutParams.f5577E0;
            eVar.f5756g = layoutParams.f5578F0;
            eVar.f5757h = layoutParams.f5579G0;
            eVar.f5759j = layoutParams.f5580H0;
            eVar.f5760k = layoutParams.f5581I0;
            eVar.f5761l = layoutParams.f5582J0;
            eVar.f5763n = layoutParams.f5585z0;
            eVar.f5762m = layoutParams.f5584y0;
        }

        /* renamed from: i */
        public void m6469i(ConstraintHelper constraintHelper, int i11, Constraints.LayoutParams layoutParams) {
            m6468h(i11, layoutParams);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f5643e;
                bVar.f5705j0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f5701h0 = barrier.getType();
                this.f5643e.f5707k0 = barrier.getReferencedIds();
                this.f5643e.f5703i0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void m6470d(a aVar) {
            C32623a c32623a = this.f5646h;
            if (c32623a != null) {
                c32623a.m6477e(aVar);
            }
        }

        /* renamed from: e */
        public void m6471e(ConstraintLayout.LayoutParams layoutParams) {
            b bVar = this.f5643e;
            layoutParams.f5521e = bVar.f5704j;
            layoutParams.f5523f = bVar.f5706k;
            layoutParams.f5525g = bVar.f5708l;
            layoutParams.f5527h = bVar.f5710m;
            layoutParams.f5529i = bVar.f5712n;
            layoutParams.f5531j = bVar.f5714o;
            layoutParams.f5533k = bVar.f5716p;
            layoutParams.f5535l = bVar.f5718q;
            layoutParams.f5537m = bVar.f5720r;
            layoutParams.f5539n = bVar.f5721s;
            layoutParams.f5541o = bVar.f5722t;
            layoutParams.f5549s = bVar.f5723u;
            layoutParams.f5551t = bVar.f5724v;
            layoutParams.f5553u = bVar.f5725w;
            layoutParams.f5555v = bVar.f5726x;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = bVar.f5667H;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = bVar.f5668I;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = bVar.f5669J;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = bVar.f5670K;
            layoutParams.f5487A = bVar.f5679T;
            layoutParams.f5488B = bVar.f5678S;
            layoutParams.f5559x = bVar.f5675P;
            layoutParams.f5561z = bVar.f5677R;
            layoutParams.f5493G = bVar.f5727y;
            layoutParams.f5494H = bVar.f5728z;
            layoutParams.f5543p = bVar.f5661B;
            layoutParams.f5545q = bVar.f5662C;
            layoutParams.f5547r = bVar.f5663D;
            layoutParams.f5495I = bVar.f5660A;
            layoutParams.f5510X = bVar.f5664E;
            layoutParams.f5511Y = bVar.f5665F;
            layoutParams.f5499M = bVar.f5681V;
            layoutParams.f5498L = bVar.f5682W;
            layoutParams.f5501O = bVar.f5684Y;
            layoutParams.f5500N = bVar.f5683X;
            layoutParams.f5514a0 = bVar.f5713n0;
            layoutParams.f5516b0 = bVar.f5715o0;
            layoutParams.f5502P = bVar.f5685Z;
            layoutParams.f5503Q = bVar.f5687a0;
            layoutParams.f5506T = bVar.f5689b0;
            layoutParams.f5507U = bVar.f5691c0;
            layoutParams.f5504R = bVar.f5693d0;
            layoutParams.f5505S = bVar.f5695e0;
            layoutParams.f5508V = bVar.f5697f0;
            layoutParams.f5509W = bVar.f5699g0;
            layoutParams.f5512Z = bVar.f5666G;
            layoutParams.f5517c = bVar.f5700h;
            layoutParams.f5513a = bVar.f5696f;
            layoutParams.f5515b = bVar.f5698g;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = bVar.f5692d;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = bVar.f5694e;
            String str = bVar.f5711m0;
            if (str != null) {
                layoutParams.f5518c0 = str;
            }
            layoutParams.f5520d0 = bVar.f5719q0;
            layoutParams.setMarginStart(bVar.f5672M);
            layoutParams.setMarginEnd(this.f5643e.f5671L);
            layoutParams.m6390c();
        }

        /* renamed from: f */
        public a clone() {
            a aVar = new a();
            aVar.f5643e.m6478a(this.f5643e);
            aVar.f5642d.m6480a(this.f5642d);
            aVar.f5641c.m6482a(this.f5641c);
            aVar.f5644f.m6484a(this.f5644f);
            aVar.f5639a = this.f5639a;
            aVar.f5646h = this.f5646h;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: r0 */
        private static SparseIntArray f5659r0;

        /* renamed from: d */
        public int f5692d;

        /* renamed from: e */
        public int f5694e;

        /* renamed from: k0 */
        public int[] f5707k0;

        /* renamed from: l0 */
        public String f5709l0;

        /* renamed from: m0 */
        public String f5711m0;

        /* renamed from: a */
        public boolean f5686a = false;

        /* renamed from: b */
        public boolean f5688b = false;

        /* renamed from: c */
        public boolean f5690c = false;

        /* renamed from: f */
        public int f5696f = -1;

        /* renamed from: g */
        public int f5698g = -1;

        /* renamed from: h */
        public float f5700h = -1.0f;

        /* renamed from: i */
        public boolean f5702i = true;

        /* renamed from: j */
        public int f5704j = -1;

        /* renamed from: k */
        public int f5706k = -1;

        /* renamed from: l */
        public int f5708l = -1;

        /* renamed from: m */
        public int f5710m = -1;

        /* renamed from: n */
        public int f5712n = -1;

        /* renamed from: o */
        public int f5714o = -1;

        /* renamed from: p */
        public int f5716p = -1;

        /* renamed from: q */
        public int f5718q = -1;

        /* renamed from: r */
        public int f5720r = -1;

        /* renamed from: s */
        public int f5721s = -1;

        /* renamed from: t */
        public int f5722t = -1;

        /* renamed from: u */
        public int f5723u = -1;

        /* renamed from: v */
        public int f5724v = -1;

        /* renamed from: w */
        public int f5725w = -1;

        /* renamed from: x */
        public int f5726x = -1;

        /* renamed from: y */
        public float f5727y = 0.5f;

        /* renamed from: z */
        public float f5728z = 0.5f;

        /* renamed from: A */
        public String f5660A = null;

        /* renamed from: B */
        public int f5661B = -1;

        /* renamed from: C */
        public int f5662C = 0;

        /* renamed from: D */
        public float f5663D = 0.0f;

        /* renamed from: E */
        public int f5664E = -1;

        /* renamed from: F */
        public int f5665F = -1;

        /* renamed from: G */
        public int f5666G = -1;

        /* renamed from: H */
        public int f5667H = 0;

        /* renamed from: I */
        public int f5668I = 0;

        /* renamed from: J */
        public int f5669J = 0;

        /* renamed from: K */
        public int f5670K = 0;

        /* renamed from: L */
        public int f5671L = 0;

        /* renamed from: M */
        public int f5672M = 0;

        /* renamed from: N */
        public int f5673N = 0;

        /* renamed from: O */
        public int f5674O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f5675P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f5676Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f5677R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f5678S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f5679T = Integer.MIN_VALUE;

        /* renamed from: U */
        public int f5680U = Integer.MIN_VALUE;

        /* renamed from: V */
        public float f5681V = -1.0f;

        /* renamed from: W */
        public float f5682W = -1.0f;

        /* renamed from: X */
        public int f5683X = 0;

        /* renamed from: Y */
        public int f5684Y = 0;

        /* renamed from: Z */
        public int f5685Z = 0;

        /* renamed from: a0 */
        public int f5687a0 = 0;

        /* renamed from: b0 */
        public int f5689b0 = 0;

        /* renamed from: c0 */
        public int f5691c0 = 0;

        /* renamed from: d0 */
        public int f5693d0 = 0;

        /* renamed from: e0 */
        public int f5695e0 = 0;

        /* renamed from: f0 */
        public float f5697f0 = 1.0f;

        /* renamed from: g0 */
        public float f5699g0 = 1.0f;

        /* renamed from: h0 */
        public int f5701h0 = -1;

        /* renamed from: i0 */
        public int f5703i0 = 0;

        /* renamed from: j0 */
        public int f5705j0 = -1;

        /* renamed from: n0 */
        public boolean f5713n0 = false;

        /* renamed from: o0 */
        public boolean f5715o0 = false;

        /* renamed from: p0 */
        public boolean f5717p0 = true;

        /* renamed from: q0 */
        public int f5719q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5659r0 = sparseIntArray;
            sparseIntArray.append(AbstractC1298f.Layout_layout_constraintLeft_toLeftOf, 24);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintLeft_toRightOf, 25);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintRight_toLeftOf, 28);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintRight_toRightOf, 29);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintTop_toTopOf, 35);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintTop_toBottomOf, 34);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintBottom_toTopOf, 4);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintBottom_toBottomOf, 3);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f5659r0.append(AbstractC1298f.Layout_layout_editor_absoluteX, 6);
            f5659r0.append(AbstractC1298f.Layout_layout_editor_absoluteY, 7);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintGuide_begin, 17);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintGuide_end, 18);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintGuide_percent, 19);
            f5659r0.append(AbstractC1298f.Layout_guidelineUseRtl, 90);
            f5659r0.append(AbstractC1298f.Layout_android_orientation, 26);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintStart_toEndOf, 31);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintStart_toStartOf, 32);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintEnd_toStartOf, 10);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintEnd_toEndOf, 9);
            f5659r0.append(AbstractC1298f.Layout_layout_goneMarginLeft, 13);
            f5659r0.append(AbstractC1298f.Layout_layout_goneMarginTop, 16);
            f5659r0.append(AbstractC1298f.Layout_layout_goneMarginRight, 14);
            f5659r0.append(AbstractC1298f.Layout_layout_goneMarginBottom, 11);
            f5659r0.append(AbstractC1298f.Layout_layout_goneMarginStart, 15);
            f5659r0.append(AbstractC1298f.Layout_layout_goneMarginEnd, 12);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintVertical_weight, 38);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintHorizontal_weight, 37);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintHorizontal_chainStyle, 39);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintVertical_chainStyle, 40);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintHorizontal_bias, 20);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintVertical_bias, 36);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintDimensionRatio, 5);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintLeft_creator, 91);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintTop_creator, 91);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintRight_creator, 91);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintBottom_creator, 91);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintBaseline_creator, 91);
            f5659r0.append(AbstractC1298f.Layout_android_layout_marginLeft, 23);
            f5659r0.append(AbstractC1298f.Layout_android_layout_marginRight, 27);
            f5659r0.append(AbstractC1298f.Layout_android_layout_marginStart, 30);
            f5659r0.append(AbstractC1298f.Layout_android_layout_marginEnd, 8);
            f5659r0.append(AbstractC1298f.Layout_android_layout_marginTop, 33);
            f5659r0.append(AbstractC1298f.Layout_android_layout_marginBottom, 2);
            f5659r0.append(AbstractC1298f.Layout_android_layout_width, 22);
            f5659r0.append(AbstractC1298f.Layout_android_layout_height, 21);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintWidth, 41);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintHeight, 42);
            f5659r0.append(AbstractC1298f.Layout_layout_constrainedWidth, 41);
            f5659r0.append(AbstractC1298f.Layout_layout_constrainedHeight, 42);
            f5659r0.append(AbstractC1298f.Layout_layout_wrapBehaviorInParent, 76);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintCircle, 61);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintCircleRadius, 62);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintCircleAngle, 63);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintWidth_percent, 69);
            f5659r0.append(AbstractC1298f.Layout_layout_constraintHeight_percent, 70);
            f5659r0.append(AbstractC1298f.Layout_chainUseRtl, 71);
            f5659r0.append(AbstractC1298f.Layout_barrierDirection, 72);
            f5659r0.append(AbstractC1298f.Layout_barrierMargin, 73);
            f5659r0.append(AbstractC1298f.Layout_constraint_referenced_ids, 74);
            f5659r0.append(AbstractC1298f.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void m6478a(b bVar) {
            this.f5686a = bVar.f5686a;
            this.f5692d = bVar.f5692d;
            this.f5688b = bVar.f5688b;
            this.f5694e = bVar.f5694e;
            this.f5696f = bVar.f5696f;
            this.f5698g = bVar.f5698g;
            this.f5700h = bVar.f5700h;
            this.f5702i = bVar.f5702i;
            this.f5704j = bVar.f5704j;
            this.f5706k = bVar.f5706k;
            this.f5708l = bVar.f5708l;
            this.f5710m = bVar.f5710m;
            this.f5712n = bVar.f5712n;
            this.f5714o = bVar.f5714o;
            this.f5716p = bVar.f5716p;
            this.f5718q = bVar.f5718q;
            this.f5720r = bVar.f5720r;
            this.f5721s = bVar.f5721s;
            this.f5722t = bVar.f5722t;
            this.f5723u = bVar.f5723u;
            this.f5724v = bVar.f5724v;
            this.f5725w = bVar.f5725w;
            this.f5726x = bVar.f5726x;
            this.f5727y = bVar.f5727y;
            this.f5728z = bVar.f5728z;
            this.f5660A = bVar.f5660A;
            this.f5661B = bVar.f5661B;
            this.f5662C = bVar.f5662C;
            this.f5663D = bVar.f5663D;
            this.f5664E = bVar.f5664E;
            this.f5665F = bVar.f5665F;
            this.f5666G = bVar.f5666G;
            this.f5667H = bVar.f5667H;
            this.f5668I = bVar.f5668I;
            this.f5669J = bVar.f5669J;
            this.f5670K = bVar.f5670K;
            this.f5671L = bVar.f5671L;
            this.f5672M = bVar.f5672M;
            this.f5673N = bVar.f5673N;
            this.f5674O = bVar.f5674O;
            this.f5675P = bVar.f5675P;
            this.f5676Q = bVar.f5676Q;
            this.f5677R = bVar.f5677R;
            this.f5678S = bVar.f5678S;
            this.f5679T = bVar.f5679T;
            this.f5680U = bVar.f5680U;
            this.f5681V = bVar.f5681V;
            this.f5682W = bVar.f5682W;
            this.f5683X = bVar.f5683X;
            this.f5684Y = bVar.f5684Y;
            this.f5685Z = bVar.f5685Z;
            this.f5687a0 = bVar.f5687a0;
            this.f5689b0 = bVar.f5689b0;
            this.f5691c0 = bVar.f5691c0;
            this.f5693d0 = bVar.f5693d0;
            this.f5695e0 = bVar.f5695e0;
            this.f5697f0 = bVar.f5697f0;
            this.f5699g0 = bVar.f5699g0;
            this.f5701h0 = bVar.f5701h0;
            this.f5703i0 = bVar.f5703i0;
            this.f5705j0 = bVar.f5705j0;
            this.f5711m0 = bVar.f5711m0;
            int[] iArr = bVar.f5707k0;
            if (iArr != null && bVar.f5709l0 == null) {
                this.f5707k0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f5707k0 = null;
            }
            this.f5709l0 = bVar.f5709l0;
            this.f5713n0 = bVar.f5713n0;
            this.f5715o0 = bVar.f5715o0;
            this.f5717p0 = bVar.f5717p0;
            this.f5719q0 = bVar.f5719q0;
        }

        /* renamed from: b */
        void m6479b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.Layout);
            this.f5688b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                int i12 = f5659r0.get(index);
                switch (i12) {
                    case 1:
                        this.f5720r = C1295c.m6419F(obtainStyledAttributes, index, this.f5720r);
                        break;
                    case 2:
                        this.f5670K = obtainStyledAttributes.getDimensionPixelSize(index, this.f5670K);
                        break;
                    case 3:
                        this.f5718q = C1295c.m6419F(obtainStyledAttributes, index, this.f5718q);
                        break;
                    case 4:
                        this.f5716p = C1295c.m6419F(obtainStyledAttributes, index, this.f5716p);
                        break;
                    case 5:
                        this.f5660A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f5664E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5664E);
                        break;
                    case 7:
                        this.f5665F = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5665F);
                        break;
                    case 8:
                        this.f5671L = obtainStyledAttributes.getDimensionPixelSize(index, this.f5671L);
                        break;
                    case 9:
                        this.f5726x = C1295c.m6419F(obtainStyledAttributes, index, this.f5726x);
                        break;
                    case 10:
                        this.f5725w = C1295c.m6419F(obtainStyledAttributes, index, this.f5725w);
                        break;
                    case 11:
                        this.f5677R = obtainStyledAttributes.getDimensionPixelSize(index, this.f5677R);
                        break;
                    case 12:
                        this.f5678S = obtainStyledAttributes.getDimensionPixelSize(index, this.f5678S);
                        break;
                    case 13:
                        this.f5674O = obtainStyledAttributes.getDimensionPixelSize(index, this.f5674O);
                        break;
                    case 14:
                        this.f5676Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f5676Q);
                        break;
                    case 15:
                        this.f5679T = obtainStyledAttributes.getDimensionPixelSize(index, this.f5679T);
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        this.f5675P = obtainStyledAttributes.getDimensionPixelSize(index, this.f5675P);
                        break;
                    case 17:
                        this.f5696f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5696f);
                        break;
                    case 18:
                        this.f5698g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f5698g);
                        break;
                    case 19:
                        this.f5700h = obtainStyledAttributes.getFloat(index, this.f5700h);
                        break;
                    case 20:
                        this.f5727y = obtainStyledAttributes.getFloat(index, this.f5727y);
                        break;
                    case 21:
                        this.f5694e = obtainStyledAttributes.getLayoutDimension(index, this.f5694e);
                        break;
                    case 22:
                        this.f5692d = obtainStyledAttributes.getLayoutDimension(index, this.f5692d);
                        break;
                    case 23:
                        this.f5667H = obtainStyledAttributes.getDimensionPixelSize(index, this.f5667H);
                        break;
                    case 24:
                        this.f5704j = C1295c.m6419F(obtainStyledAttributes, index, this.f5704j);
                        break;
                    case 25:
                        this.f5706k = C1295c.m6419F(obtainStyledAttributes, index, this.f5706k);
                        break;
                    case 26:
                        this.f5666G = obtainStyledAttributes.getInt(index, this.f5666G);
                        break;
                    case 27:
                        this.f5668I = obtainStyledAttributes.getDimensionPixelSize(index, this.f5668I);
                        break;
                    case 28:
                        this.f5708l = C1295c.m6419F(obtainStyledAttributes, index, this.f5708l);
                        break;
                    case 29:
                        this.f5710m = C1295c.m6419F(obtainStyledAttributes, index, this.f5710m);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        this.f5672M = obtainStyledAttributes.getDimensionPixelSize(index, this.f5672M);
                        break;
                    case 31:
                        this.f5723u = C1295c.m6419F(obtainStyledAttributes, index, this.f5723u);
                        break;
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        this.f5724v = C1295c.m6419F(obtainStyledAttributes, index, this.f5724v);
                        break;
                    case 33:
                        this.f5669J = obtainStyledAttributes.getDimensionPixelSize(index, this.f5669J);
                        break;
                    case 34:
                        this.f5714o = C1295c.m6419F(obtainStyledAttributes, index, this.f5714o);
                        break;
                    case 35:
                        this.f5712n = C1295c.m6419F(obtainStyledAttributes, index, this.f5712n);
                        break;
                    case 36:
                        this.f5728z = obtainStyledAttributes.getFloat(index, this.f5728z);
                        break;
                    case 37:
                        this.f5682W = obtainStyledAttributes.getFloat(index, this.f5682W);
                        break;
                    case 38:
                        this.f5681V = obtainStyledAttributes.getFloat(index, this.f5681V);
                        break;
                    case 39:
                        this.f5683X = obtainStyledAttributes.getInt(index, this.f5683X);
                        break;
                    case 40:
                        this.f5684Y = obtainStyledAttributes.getInt(index, this.f5684Y);
                        break;
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                        C1295c.m6420G(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C1295c.m6420G(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i12) {
                            case 61:
                                this.f5661B = C1295c.m6419F(obtainStyledAttributes, index, this.f5661B);
                                break;
                            case 62:
                                this.f5662C = obtainStyledAttributes.getDimensionPixelSize(index, this.f5662C);
                                break;
                            case 63:
                                this.f5663D = obtainStyledAttributes.getFloat(index, this.f5663D);
                                break;
                            default:
                                switch (i12) {
                                    case 69:
                                        this.f5697f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f5699g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f5701h0 = obtainStyledAttributes.getInt(index, this.f5701h0);
                                        break;
                                    case 73:
                                        this.f5703i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f5703i0);
                                        break;
                                    case 74:
                                        this.f5709l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f5717p0 = obtainStyledAttributes.getBoolean(index, this.f5717p0);
                                        break;
                                    case 76:
                                        this.f5719q0 = obtainStyledAttributes.getInt(index, this.f5719q0);
                                        break;
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                                        this.f5721s = C1295c.m6419F(obtainStyledAttributes, index, this.f5721s);
                                        break;
                                    case 78:
                                        this.f5722t = C1295c.m6419F(obtainStyledAttributes, index, this.f5722t);
                                        break;
                                    case 79:
                                        this.f5680U = obtainStyledAttributes.getDimensionPixelSize(index, this.f5680U);
                                        break;
                                    case 80:
                                        this.f5673N = obtainStyledAttributes.getDimensionPixelSize(index, this.f5673N);
                                        break;
                                    case 81:
                                        this.f5685Z = obtainStyledAttributes.getInt(index, this.f5685Z);
                                        break;
                                    case 82:
                                        this.f5687a0 = obtainStyledAttributes.getInt(index, this.f5687a0);
                                        break;
                                    case 83:
                                        this.f5691c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f5691c0);
                                        break;
                                    case 84:
                                        this.f5689b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f5689b0);
                                        break;
                                    case 85:
                                        this.f5695e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f5695e0);
                                        break;
                                    case 86:
                                        this.f5693d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f5693d0);
                                        break;
                                    case 87:
                                        this.f5713n0 = obtainStyledAttributes.getBoolean(index, this.f5713n0);
                                        break;
                                    case 88:
                                        this.f5715o0 = obtainStyledAttributes.getBoolean(index, this.f5715o0);
                                        break;
                                    case 89:
                                        this.f5711m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f5702i = obtainStyledAttributes.getBoolean(index, this.f5702i);
                                        break;
                                    case 91:
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("unused attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append("   ");
                                        sb2.append(f5659r0.get(index));
                                        break;
                                    default:
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Unknown attribute 0x");
                                        sb3.append(Integer.toHexString(index));
                                        sb3.append("   ");
                                        sb3.append(f5659r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: o */
        private static SparseIntArray f5729o;

        /* renamed from: a */
        public boolean f5730a = false;

        /* renamed from: b */
        public int f5731b = -1;

        /* renamed from: c */
        public int f5732c = 0;

        /* renamed from: d */
        public String f5733d = null;

        /* renamed from: e */
        public int f5734e = -1;

        /* renamed from: f */
        public int f5735f = 0;

        /* renamed from: g */
        public float f5736g = Float.NaN;

        /* renamed from: h */
        public int f5737h = -1;

        /* renamed from: i */
        public float f5738i = Float.NaN;

        /* renamed from: j */
        public float f5739j = Float.NaN;

        /* renamed from: k */
        public int f5740k = -1;

        /* renamed from: l */
        public String f5741l = null;

        /* renamed from: m */
        public int f5742m = -3;

        /* renamed from: n */
        public int f5743n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5729o = sparseIntArray;
            sparseIntArray.append(AbstractC1298f.Motion_motionPathRotate, 1);
            f5729o.append(AbstractC1298f.Motion_pathMotionArc, 2);
            f5729o.append(AbstractC1298f.Motion_transitionEasing, 3);
            f5729o.append(AbstractC1298f.Motion_drawPath, 4);
            f5729o.append(AbstractC1298f.Motion_animateRelativeTo, 5);
            f5729o.append(AbstractC1298f.Motion_animateCircleAngleTo, 6);
            f5729o.append(AbstractC1298f.Motion_motionStagger, 7);
            f5729o.append(AbstractC1298f.Motion_quantizeMotionSteps, 8);
            f5729o.append(AbstractC1298f.Motion_quantizeMotionPhase, 9);
            f5729o.append(AbstractC1298f.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public void m6480a(c cVar) {
            this.f5730a = cVar.f5730a;
            this.f5731b = cVar.f5731b;
            this.f5733d = cVar.f5733d;
            this.f5734e = cVar.f5734e;
            this.f5735f = cVar.f5735f;
            this.f5738i = cVar.f5738i;
            this.f5736g = cVar.f5736g;
            this.f5737h = cVar.f5737h;
        }

        /* renamed from: b */
        void m6481b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.Motion);
            this.f5730a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f5729o.get(index)) {
                    case 1:
                        this.f5738i = obtainStyledAttributes.getFloat(index, this.f5738i);
                        break;
                    case 2:
                        this.f5734e = obtainStyledAttributes.getInt(index, this.f5734e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f5733d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f5733d = C0022c.f60c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f5735f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f5731b = C1295c.m6419F(obtainStyledAttributes, index, this.f5731b);
                        break;
                    case 6:
                        this.f5732c = obtainStyledAttributes.getInteger(index, this.f5732c);
                        break;
                    case 7:
                        this.f5736g = obtainStyledAttributes.getFloat(index, this.f5736g);
                        break;
                    case 8:
                        this.f5740k = obtainStyledAttributes.getInteger(index, this.f5740k);
                        break;
                    case 9:
                        this.f5739j = obtainStyledAttributes.getFloat(index, this.f5739j);
                        break;
                    case 10:
                        int i12 = obtainStyledAttributes.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f5743n = resourceId;
                            if (resourceId != -1) {
                                this.f5742m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i12 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.f5741l = string;
                            if (string.indexOf("/") > 0) {
                                this.f5743n = obtainStyledAttributes.getResourceId(index, -1);
                                this.f5742m = -2;
                                break;
                            } else {
                                this.f5742m = -1;
                                break;
                            }
                        } else {
                            this.f5742m = obtainStyledAttributes.getInteger(index, this.f5743n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        public boolean f5744a = false;

        /* renamed from: b */
        public int f5745b = 0;

        /* renamed from: c */
        public int f5746c = 0;

        /* renamed from: d */
        public float f5747d = 1.0f;

        /* renamed from: e */
        public float f5748e = Float.NaN;

        /* renamed from: a */
        public void m6482a(d dVar) {
            this.f5744a = dVar.f5744a;
            this.f5745b = dVar.f5745b;
            this.f5747d = dVar.f5747d;
            this.f5748e = dVar.f5748e;
            this.f5746c = dVar.f5746c;
        }

        /* renamed from: b */
        void m6483b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.PropertySet);
            this.f5744a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.PropertySet_android_alpha) {
                    this.f5747d = obtainStyledAttributes.getFloat(index, this.f5747d);
                } else if (index == AbstractC1298f.PropertySet_android_visibility) {
                    this.f5745b = obtainStyledAttributes.getInt(index, this.f5745b);
                    this.f5745b = C1295c.f5629h[this.f5745b];
                } else if (index == AbstractC1298f.PropertySet_visibilityMode) {
                    this.f5746c = obtainStyledAttributes.getInt(index, this.f5746c);
                } else if (index == AbstractC1298f.PropertySet_motionProgress) {
                    this.f5748e = obtainStyledAttributes.getFloat(index, this.f5748e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: o */
        private static SparseIntArray f5749o;

        /* renamed from: a */
        public boolean f5750a = false;

        /* renamed from: b */
        public float f5751b = 0.0f;

        /* renamed from: c */
        public float f5752c = 0.0f;

        /* renamed from: d */
        public float f5753d = 0.0f;

        /* renamed from: e */
        public float f5754e = 1.0f;

        /* renamed from: f */
        public float f5755f = 1.0f;

        /* renamed from: g */
        public float f5756g = Float.NaN;

        /* renamed from: h */
        public float f5757h = Float.NaN;

        /* renamed from: i */
        public int f5758i = -1;

        /* renamed from: j */
        public float f5759j = 0.0f;

        /* renamed from: k */
        public float f5760k = 0.0f;

        /* renamed from: l */
        public float f5761l = 0.0f;

        /* renamed from: m */
        public boolean f5762m = false;

        /* renamed from: n */
        public float f5763n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5749o = sparseIntArray;
            sparseIntArray.append(AbstractC1298f.Transform_android_rotation, 1);
            f5749o.append(AbstractC1298f.Transform_android_rotationX, 2);
            f5749o.append(AbstractC1298f.Transform_android_rotationY, 3);
            f5749o.append(AbstractC1298f.Transform_android_scaleX, 4);
            f5749o.append(AbstractC1298f.Transform_android_scaleY, 5);
            f5749o.append(AbstractC1298f.Transform_android_transformPivotX, 6);
            f5749o.append(AbstractC1298f.Transform_android_transformPivotY, 7);
            f5749o.append(AbstractC1298f.Transform_android_translationX, 8);
            f5749o.append(AbstractC1298f.Transform_android_translationY, 9);
            f5749o.append(AbstractC1298f.Transform_android_translationZ, 10);
            f5749o.append(AbstractC1298f.Transform_android_elevation, 11);
            f5749o.append(AbstractC1298f.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public void m6484a(e eVar) {
            this.f5750a = eVar.f5750a;
            this.f5751b = eVar.f5751b;
            this.f5752c = eVar.f5752c;
            this.f5753d = eVar.f5753d;
            this.f5754e = eVar.f5754e;
            this.f5755f = eVar.f5755f;
            this.f5756g = eVar.f5756g;
            this.f5757h = eVar.f5757h;
            this.f5758i = eVar.f5758i;
            this.f5759j = eVar.f5759j;
            this.f5760k = eVar.f5760k;
            this.f5761l = eVar.f5761l;
            this.f5762m = eVar.f5762m;
            this.f5763n = eVar.f5763n;
        }

        /* renamed from: b */
        void m6485b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.Transform);
            this.f5750a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                switch (f5749o.get(index)) {
                    case 1:
                        this.f5751b = obtainStyledAttributes.getFloat(index, this.f5751b);
                        break;
                    case 2:
                        this.f5752c = obtainStyledAttributes.getFloat(index, this.f5752c);
                        break;
                    case 3:
                        this.f5753d = obtainStyledAttributes.getFloat(index, this.f5753d);
                        break;
                    case 4:
                        this.f5754e = obtainStyledAttributes.getFloat(index, this.f5754e);
                        break;
                    case 5:
                        this.f5755f = obtainStyledAttributes.getFloat(index, this.f5755f);
                        break;
                    case 6:
                        this.f5756g = obtainStyledAttributes.getDimension(index, this.f5756g);
                        break;
                    case 7:
                        this.f5757h = obtainStyledAttributes.getDimension(index, this.f5757h);
                        break;
                    case 8:
                        this.f5759j = obtainStyledAttributes.getDimension(index, this.f5759j);
                        break;
                    case 9:
                        this.f5760k = obtainStyledAttributes.getDimension(index, this.f5760k);
                        break;
                    case 10:
                        this.f5761l = obtainStyledAttributes.getDimension(index, this.f5761l);
                        break;
                    case 11:
                        this.f5762m = true;
                        this.f5763n = obtainStyledAttributes.getDimension(index, this.f5763n);
                        break;
                    case 12:
                        this.f5758i = C1295c.m6419F(obtainStyledAttributes, index, this.f5758i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f5630i.append(AbstractC1298f.Constraint_layout_constraintLeft_toLeftOf, 25);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintLeft_toRightOf, 26);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintRight_toLeftOf, 29);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintRight_toRightOf, 30);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintTop_toTopOf, 36);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintTop_toBottomOf, 35);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBottom_toTopOf, 4);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBottom_toBottomOf, 3);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBaseline_toTopOf, 91);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f5630i.append(AbstractC1298f.Constraint_layout_editor_absoluteX, 6);
        f5630i.append(AbstractC1298f.Constraint_layout_editor_absoluteY, 7);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintGuide_begin, 17);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintGuide_end, 18);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintGuide_percent, 19);
        f5630i.append(AbstractC1298f.Constraint_guidelineUseRtl, 99);
        f5630i.append(AbstractC1298f.Constraint_android_orientation, 27);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintStart_toEndOf, 32);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintStart_toStartOf, 33);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintEnd_toStartOf, 10);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintEnd_toEndOf, 9);
        f5630i.append(AbstractC1298f.Constraint_layout_goneMarginLeft, 13);
        f5630i.append(AbstractC1298f.Constraint_layout_goneMarginTop, 16);
        f5630i.append(AbstractC1298f.Constraint_layout_goneMarginRight, 14);
        f5630i.append(AbstractC1298f.Constraint_layout_goneMarginBottom, 11);
        f5630i.append(AbstractC1298f.Constraint_layout_goneMarginStart, 15);
        f5630i.append(AbstractC1298f.Constraint_layout_goneMarginEnd, 12);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintVertical_weight, 40);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHorizontal_weight, 39);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintVertical_chainStyle, 42);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHorizontal_bias, 20);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintVertical_bias, 37);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintDimensionRatio, 5);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintLeft_creator, 87);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintTop_creator, 87);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintRight_creator, 87);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBottom_creator, 87);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintBaseline_creator, 87);
        f5630i.append(AbstractC1298f.Constraint_android_layout_marginLeft, 24);
        f5630i.append(AbstractC1298f.Constraint_android_layout_marginRight, 28);
        f5630i.append(AbstractC1298f.Constraint_android_layout_marginStart, 31);
        f5630i.append(AbstractC1298f.Constraint_android_layout_marginEnd, 8);
        f5630i.append(AbstractC1298f.Constraint_android_layout_marginTop, 34);
        f5630i.append(AbstractC1298f.Constraint_android_layout_marginBottom, 2);
        f5630i.append(AbstractC1298f.Constraint_android_layout_width, 23);
        f5630i.append(AbstractC1298f.Constraint_android_layout_height, 21);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintWidth, 95);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHeight, 96);
        f5630i.append(AbstractC1298f.Constraint_android_visibility, 22);
        f5630i.append(AbstractC1298f.Constraint_android_alpha, 43);
        f5630i.append(AbstractC1298f.Constraint_android_elevation, 44);
        f5630i.append(AbstractC1298f.Constraint_android_rotationX, 45);
        f5630i.append(AbstractC1298f.Constraint_android_rotationY, 46);
        f5630i.append(AbstractC1298f.Constraint_android_rotation, 60);
        f5630i.append(AbstractC1298f.Constraint_android_scaleX, 47);
        f5630i.append(AbstractC1298f.Constraint_android_scaleY, 48);
        f5630i.append(AbstractC1298f.Constraint_android_transformPivotX, 49);
        f5630i.append(AbstractC1298f.Constraint_android_transformPivotY, 50);
        f5630i.append(AbstractC1298f.Constraint_android_translationX, 51);
        f5630i.append(AbstractC1298f.Constraint_android_translationY, 52);
        f5630i.append(AbstractC1298f.Constraint_android_translationZ, 53);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintWidth_default, 54);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHeight_default, 55);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintWidth_max, 56);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHeight_max, 57);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintWidth_min, 58);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHeight_min, 59);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintCircle, 61);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintCircleRadius, 62);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintCircleAngle, 63);
        f5630i.append(AbstractC1298f.Constraint_animateRelativeTo, 64);
        f5630i.append(AbstractC1298f.Constraint_transitionEasing, 65);
        f5630i.append(AbstractC1298f.Constraint_drawPath, 66);
        f5630i.append(AbstractC1298f.Constraint_transitionPathRotate, 67);
        f5630i.append(AbstractC1298f.Constraint_motionStagger, 79);
        f5630i.append(AbstractC1298f.Constraint_android_id, 38);
        f5630i.append(AbstractC1298f.Constraint_motionProgress, 68);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintWidth_percent, 69);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintHeight_percent, 70);
        f5630i.append(AbstractC1298f.Constraint_layout_wrapBehaviorInParent, 97);
        f5630i.append(AbstractC1298f.Constraint_chainUseRtl, 71);
        f5630i.append(AbstractC1298f.Constraint_barrierDirection, 72);
        f5630i.append(AbstractC1298f.Constraint_barrierMargin, 73);
        f5630i.append(AbstractC1298f.Constraint_constraint_referenced_ids, 74);
        f5630i.append(AbstractC1298f.Constraint_barrierAllowsGoneWidgets, 75);
        f5630i.append(AbstractC1298f.Constraint_pathMotionArc, 76);
        f5630i.append(AbstractC1298f.Constraint_layout_constraintTag, 77);
        f5630i.append(AbstractC1298f.Constraint_visibilityMode, 78);
        f5630i.append(AbstractC1298f.Constraint_layout_constrainedWidth, 80);
        f5630i.append(AbstractC1298f.Constraint_layout_constrainedHeight, 81);
        f5630i.append(AbstractC1298f.Constraint_polarRelativeTo, 82);
        f5630i.append(AbstractC1298f.Constraint_transformPivotTarget, 83);
        f5630i.append(AbstractC1298f.Constraint_quantizeMotionSteps, 84);
        f5630i.append(AbstractC1298f.Constraint_quantizeMotionPhase, 85);
        f5630i.append(AbstractC1298f.Constraint_quantizeMotionInterpolator, 86);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_editor_absoluteY, 6);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_editor_absoluteY, 7);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_orientation, 27);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_goneMarginLeft, 13);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_goneMarginTop, 16);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_goneMarginRight, 14);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_goneMarginBottom, 11);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_goneMarginStart, 15);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_goneMarginEnd, 12);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintVertical_weight, 40);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintVertical_bias, 37);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintLeft_creator, 87);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintTop_creator, 87);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintRight_creator, 87);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintBottom_creator, 87);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_marginLeft, 24);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_marginRight, 28);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_marginStart, 31);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_marginEnd, 8);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_marginTop, 34);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_marginBottom, 2);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_width, 23);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_layout_height, 21);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintWidth, 95);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHeight, 96);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_visibility, 22);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_alpha, 43);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_elevation, 44);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_rotationX, 45);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_rotationY, 46);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_rotation, 60);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_scaleX, 47);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_scaleY, 48);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_transformPivotX, 49);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_transformPivotY, 50);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_translationX, 51);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_translationY, 52);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_translationZ, 53);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintWidth_default, 54);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHeight_default, 55);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintWidth_max, 56);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHeight_max, 57);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintWidth_min, 58);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHeight_min, 59);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintCircleRadius, 62);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintCircleAngle, 63);
        f5631j.append(AbstractC1298f.ConstraintOverride_animateRelativeTo, 64);
        f5631j.append(AbstractC1298f.ConstraintOverride_transitionEasing, 65);
        f5631j.append(AbstractC1298f.ConstraintOverride_drawPath, 66);
        f5631j.append(AbstractC1298f.ConstraintOverride_transitionPathRotate, 67);
        f5631j.append(AbstractC1298f.ConstraintOverride_motionStagger, 79);
        f5631j.append(AbstractC1298f.ConstraintOverride_android_id, 38);
        f5631j.append(AbstractC1298f.ConstraintOverride_motionTarget, 98);
        f5631j.append(AbstractC1298f.ConstraintOverride_motionProgress, 68);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintWidth_percent, 69);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintHeight_percent, 70);
        f5631j.append(AbstractC1298f.ConstraintOverride_chainUseRtl, 71);
        f5631j.append(AbstractC1298f.ConstraintOverride_barrierDirection, 72);
        f5631j.append(AbstractC1298f.ConstraintOverride_barrierMargin, 73);
        f5631j.append(AbstractC1298f.ConstraintOverride_constraint_referenced_ids, 74);
        f5631j.append(AbstractC1298f.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f5631j.append(AbstractC1298f.ConstraintOverride_pathMotionArc, 76);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constraintTag, 77);
        f5631j.append(AbstractC1298f.ConstraintOverride_visibilityMode, 78);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constrainedWidth, 80);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_constrainedHeight, 81);
        f5631j.append(AbstractC1298f.ConstraintOverride_polarRelativeTo, 82);
        f5631j.append(AbstractC1298f.ConstraintOverride_transformPivotTarget, 83);
        f5631j.append(AbstractC1298f.ConstraintOverride_quantizeMotionSteps, 84);
        f5631j.append(AbstractC1298f.ConstraintOverride_quantizeMotionPhase, 85);
        f5631j.append(AbstractC1298f.ConstraintOverride_quantizeMotionInterpolator, 86);
        f5631j.append(AbstractC1298f.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* renamed from: F */
    public static int m6419F(TypedArray typedArray, int i11, int i12) {
        int resourceId = typedArray.getResourceId(i11, i12);
        if (resourceId == -1) {
            return typedArray.getInt(i11, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:            if (r4 == (-1)) goto L62;     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6420G(Object obj, TypedArray typedArray, int i11, int i12) {
        int dimensionPixelSize;
        boolean z11;
        if (obj == null) {
            return;
        }
        int i13 = typedArray.peekValue(i11).type;
        if (i13 != 3) {
            int i14 = 0;
            if (i13 != 5) {
                dimensionPixelSize = typedArray.getInt(i11, 0);
                if (dimensionPixelSize != -4) {
                    if (dimensionPixelSize != -3) {
                        if (dimensionPixelSize != -2) {
                        }
                    }
                    z11 = false;
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i12 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = i14;
                            layoutParams.f5514a0 = z11;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = i14;
                            layoutParams.f5516b0 = z11;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        if (i12 == 0) {
                            bVar.f5692d = i14;
                            bVar.f5713n0 = z11;
                            return;
                        } else {
                            bVar.f5694e = i14;
                            bVar.f5715o0 = z11;
                            return;
                        }
                    }
                    if (obj instanceof a.C32623a) {
                        a.C32623a c32623a = (a.C32623a) obj;
                        if (i12 == 0) {
                            c32623a.m6474b(23, i14);
                            c32623a.m6476d(80, z11);
                            return;
                        } else {
                            c32623a.m6474b(21, i14);
                            c32623a.m6476d(81, z11);
                            return;
                        }
                    }
                    return;
                }
                z11 = true;
                i14 = -2;
                if (obj instanceof ConstraintLayout.LayoutParams) {
                }
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i11, 0);
            }
            i14 = dimensionPixelSize;
            z11 = false;
            if (obj instanceof ConstraintLayout.LayoutParams) {
            }
        } else {
            m6421H(obj, typedArray.getString(i11), i12);
        }
    }

    /* renamed from: H */
    static void m6421H(Object obj, String str, int i11) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        }
                        m6422I(layoutParams, trim2);
                        return;
                    }
                    if (obj instanceof b) {
                        ((b) obj).f5660A = trim2;
                        return;
                    } else {
                        if (obj instanceof a.C32623a) {
                            ((a.C32623a) obj).m6475c(5, trim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i11 == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                layoutParams2.f5498L = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                layoutParams2.f5499M = parseFloat;
                            }
                        } else if (obj instanceof b) {
                            b bVar = (b) obj;
                            if (i11 == 0) {
                                bVar.f5692d = 0;
                                bVar.f5682W = parseFloat;
                            } else {
                                bVar.f5694e = 0;
                                bVar.f5681V = parseFloat;
                            }
                        } else if (obj instanceof a.C32623a) {
                            a.C32623a c32623a = (a.C32623a) obj;
                            if (i11 == 0) {
                                c32623a.m6474b(23, 0);
                                c32623a.m6473a(39, parseFloat);
                            } else {
                                c32623a.m6474b(21, 0);
                                c32623a.m6473a(40, parseFloat);
                            }
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i11 == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                                layoutParams3.f5508V = max;
                                layoutParams3.f5502P = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                                layoutParams3.f5509W = max;
                                layoutParams3.f5503Q = 2;
                            }
                        } else if (obj instanceof b) {
                            b bVar2 = (b) obj;
                            if (i11 == 0) {
                                bVar2.f5692d = 0;
                                bVar2.f5697f0 = max;
                                bVar2.f5685Z = 2;
                            } else {
                                bVar2.f5694e = 0;
                                bVar2.f5699g0 = max;
                                bVar2.f5687a0 = 2;
                            }
                        } else if (obj instanceof a.C32623a) {
                            a.C32623a c32623a2 = (a.C32623a) obj;
                            if (i11 == 0) {
                                c32623a2.m6474b(23, 0);
                                c32623a2.m6474b(54, 2);
                            } else {
                                c32623a2.m6474b(21, 0);
                                c32623a2.m6474b(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* renamed from: I */
    public static void m6422I(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f11 = Float.NaN;
        int i11 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i12 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i11 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i11 = 1;
                }
                i12 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i12, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f11 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                } else {
                    String substring4 = str.substring(i12);
                    if (substring4.length() > 0) {
                        f11 = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f5495I = str;
        layoutParams.f5496J = f11;
        layoutParams.f5497K = i11;
    }

    /* renamed from: J */
    private void m6423J(Context context, a aVar, TypedArray typedArray, boolean z11) {
        if (z11) {
            m6424K(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            if (index != AbstractC1298f.Constraint_android_id && AbstractC1298f.Constraint_android_layout_marginStart != index && AbstractC1298f.Constraint_android_layout_marginEnd != index) {
                aVar.f5642d.f5730a = true;
                aVar.f5643e.f5688b = true;
                aVar.f5641c.f5744a = true;
                aVar.f5644f.f5750a = true;
            }
            switch (f5630i.get(index)) {
                case 1:
                    b bVar = aVar.f5643e;
                    bVar.f5720r = m6419F(typedArray, index, bVar.f5720r);
                    break;
                case 2:
                    b bVar2 = aVar.f5643e;
                    bVar2.f5670K = typedArray.getDimensionPixelSize(index, bVar2.f5670K);
                    break;
                case 3:
                    b bVar3 = aVar.f5643e;
                    bVar3.f5718q = m6419F(typedArray, index, bVar3.f5718q);
                    break;
                case 4:
                    b bVar4 = aVar.f5643e;
                    bVar4.f5716p = m6419F(typedArray, index, bVar4.f5716p);
                    break;
                case 5:
                    aVar.f5643e.f5660A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f5643e;
                    bVar5.f5664E = typedArray.getDimensionPixelOffset(index, bVar5.f5664E);
                    break;
                case 7:
                    b bVar6 = aVar.f5643e;
                    bVar6.f5665F = typedArray.getDimensionPixelOffset(index, bVar6.f5665F);
                    break;
                case 8:
                    b bVar7 = aVar.f5643e;
                    bVar7.f5671L = typedArray.getDimensionPixelSize(index, bVar7.f5671L);
                    break;
                case 9:
                    b bVar8 = aVar.f5643e;
                    bVar8.f5726x = m6419F(typedArray, index, bVar8.f5726x);
                    break;
                case 10:
                    b bVar9 = aVar.f5643e;
                    bVar9.f5725w = m6419F(typedArray, index, bVar9.f5725w);
                    break;
                case 11:
                    b bVar10 = aVar.f5643e;
                    bVar10.f5677R = typedArray.getDimensionPixelSize(index, bVar10.f5677R);
                    break;
                case 12:
                    b bVar11 = aVar.f5643e;
                    bVar11.f5678S = typedArray.getDimensionPixelSize(index, bVar11.f5678S);
                    break;
                case 13:
                    b bVar12 = aVar.f5643e;
                    bVar12.f5674O = typedArray.getDimensionPixelSize(index, bVar12.f5674O);
                    break;
                case 14:
                    b bVar13 = aVar.f5643e;
                    bVar13.f5676Q = typedArray.getDimensionPixelSize(index, bVar13.f5676Q);
                    break;
                case 15:
                    b bVar14 = aVar.f5643e;
                    bVar14.f5679T = typedArray.getDimensionPixelSize(index, bVar14.f5679T);
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    b bVar15 = aVar.f5643e;
                    bVar15.f5675P = typedArray.getDimensionPixelSize(index, bVar15.f5675P);
                    break;
                case 17:
                    b bVar16 = aVar.f5643e;
                    bVar16.f5696f = typedArray.getDimensionPixelOffset(index, bVar16.f5696f);
                    break;
                case 18:
                    b bVar17 = aVar.f5643e;
                    bVar17.f5698g = typedArray.getDimensionPixelOffset(index, bVar17.f5698g);
                    break;
                case 19:
                    b bVar18 = aVar.f5643e;
                    bVar18.f5700h = typedArray.getFloat(index, bVar18.f5700h);
                    break;
                case 20:
                    b bVar19 = aVar.f5643e;
                    bVar19.f5727y = typedArray.getFloat(index, bVar19.f5727y);
                    break;
                case 21:
                    b bVar20 = aVar.f5643e;
                    bVar20.f5694e = typedArray.getLayoutDimension(index, bVar20.f5694e);
                    break;
                case 22:
                    d dVar = aVar.f5641c;
                    dVar.f5745b = typedArray.getInt(index, dVar.f5745b);
                    d dVar2 = aVar.f5641c;
                    dVar2.f5745b = f5629h[dVar2.f5745b];
                    break;
                case 23:
                    b bVar21 = aVar.f5643e;
                    bVar21.f5692d = typedArray.getLayoutDimension(index, bVar21.f5692d);
                    break;
                case 24:
                    b bVar22 = aVar.f5643e;
                    bVar22.f5667H = typedArray.getDimensionPixelSize(index, bVar22.f5667H);
                    break;
                case 25:
                    b bVar23 = aVar.f5643e;
                    bVar23.f5704j = m6419F(typedArray, index, bVar23.f5704j);
                    break;
                case 26:
                    b bVar24 = aVar.f5643e;
                    bVar24.f5706k = m6419F(typedArray, index, bVar24.f5706k);
                    break;
                case 27:
                    b bVar25 = aVar.f5643e;
                    bVar25.f5666G = typedArray.getInt(index, bVar25.f5666G);
                    break;
                case 28:
                    b bVar26 = aVar.f5643e;
                    bVar26.f5668I = typedArray.getDimensionPixelSize(index, bVar26.f5668I);
                    break;
                case 29:
                    b bVar27 = aVar.f5643e;
                    bVar27.f5708l = m6419F(typedArray, index, bVar27.f5708l);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                    b bVar28 = aVar.f5643e;
                    bVar28.f5710m = m6419F(typedArray, index, bVar28.f5710m);
                    break;
                case 31:
                    b bVar29 = aVar.f5643e;
                    bVar29.f5672M = typedArray.getDimensionPixelSize(index, bVar29.f5672M);
                    break;
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                    b bVar30 = aVar.f5643e;
                    bVar30.f5723u = m6419F(typedArray, index, bVar30.f5723u);
                    break;
                case 33:
                    b bVar31 = aVar.f5643e;
                    bVar31.f5724v = m6419F(typedArray, index, bVar31.f5724v);
                    break;
                case 34:
                    b bVar32 = aVar.f5643e;
                    bVar32.f5669J = typedArray.getDimensionPixelSize(index, bVar32.f5669J);
                    break;
                case 35:
                    b bVar33 = aVar.f5643e;
                    bVar33.f5714o = m6419F(typedArray, index, bVar33.f5714o);
                    break;
                case 36:
                    b bVar34 = aVar.f5643e;
                    bVar34.f5712n = m6419F(typedArray, index, bVar34.f5712n);
                    break;
                case 37:
                    b bVar35 = aVar.f5643e;
                    bVar35.f5728z = typedArray.getFloat(index, bVar35.f5728z);
                    break;
                case 38:
                    aVar.f5639a = typedArray.getResourceId(index, aVar.f5639a);
                    break;
                case 39:
                    b bVar36 = aVar.f5643e;
                    bVar36.f5682W = typedArray.getFloat(index, bVar36.f5682W);
                    break;
                case 40:
                    b bVar37 = aVar.f5643e;
                    bVar37.f5681V = typedArray.getFloat(index, bVar37.f5681V);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    b bVar38 = aVar.f5643e;
                    bVar38.f5683X = typedArray.getInt(index, bVar38.f5683X);
                    break;
                case 42:
                    b bVar39 = aVar.f5643e;
                    bVar39.f5684Y = typedArray.getInt(index, bVar39.f5684Y);
                    break;
                case 43:
                    d dVar3 = aVar.f5641c;
                    dVar3.f5747d = typedArray.getFloat(index, dVar3.f5747d);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    e eVar = aVar.f5644f;
                    eVar.f5762m = true;
                    eVar.f5763n = typedArray.getDimension(index, eVar.f5763n);
                    break;
                case 45:
                    e eVar2 = aVar.f5644f;
                    eVar2.f5752c = typedArray.getFloat(index, eVar2.f5752c);
                    break;
                case 46:
                    e eVar3 = aVar.f5644f;
                    eVar3.f5753d = typedArray.getFloat(index, eVar3.f5753d);
                    break;
                case 47:
                    e eVar4 = aVar.f5644f;
                    eVar4.f5754e = typedArray.getFloat(index, eVar4.f5754e);
                    break;
                case 48:
                    e eVar5 = aVar.f5644f;
                    eVar5.f5755f = typedArray.getFloat(index, eVar5.f5755f);
                    break;
                case 49:
                    e eVar6 = aVar.f5644f;
                    eVar6.f5756g = typedArray.getDimension(index, eVar6.f5756g);
                    break;
                case 50:
                    e eVar7 = aVar.f5644f;
                    eVar7.f5757h = typedArray.getDimension(index, eVar7.f5757h);
                    break;
                case 51:
                    e eVar8 = aVar.f5644f;
                    eVar8.f5759j = typedArray.getDimension(index, eVar8.f5759j);
                    break;
                case 52:
                    e eVar9 = aVar.f5644f;
                    eVar9.f5760k = typedArray.getDimension(index, eVar9.f5760k);
                    break;
                case 53:
                    e eVar10 = aVar.f5644f;
                    eVar10.f5761l = typedArray.getDimension(index, eVar10.f5761l);
                    break;
                case 54:
                    b bVar40 = aVar.f5643e;
                    bVar40.f5685Z = typedArray.getInt(index, bVar40.f5685Z);
                    break;
                case 55:
                    b bVar41 = aVar.f5643e;
                    bVar41.f5687a0 = typedArray.getInt(index, bVar41.f5687a0);
                    break;
                case 56:
                    b bVar42 = aVar.f5643e;
                    bVar42.f5689b0 = typedArray.getDimensionPixelSize(index, bVar42.f5689b0);
                    break;
                case 57:
                    b bVar43 = aVar.f5643e;
                    bVar43.f5691c0 = typedArray.getDimensionPixelSize(index, bVar43.f5691c0);
                    break;
                case 58:
                    b bVar44 = aVar.f5643e;
                    bVar44.f5693d0 = typedArray.getDimensionPixelSize(index, bVar44.f5693d0);
                    break;
                case 59:
                    b bVar45 = aVar.f5643e;
                    bVar45.f5695e0 = typedArray.getDimensionPixelSize(index, bVar45.f5695e0);
                    break;
                case 60:
                    e eVar11 = aVar.f5644f;
                    eVar11.f5751b = typedArray.getFloat(index, eVar11.f5751b);
                    break;
                case 61:
                    b bVar46 = aVar.f5643e;
                    bVar46.f5661B = m6419F(typedArray, index, bVar46.f5661B);
                    break;
                case 62:
                    b bVar47 = aVar.f5643e;
                    bVar47.f5662C = typedArray.getDimensionPixelSize(index, bVar47.f5662C);
                    break;
                case 63:
                    b bVar48 = aVar.f5643e;
                    bVar48.f5663D = typedArray.getFloat(index, bVar48.f5663D);
                    break;
                case 64:
                    c cVar = aVar.f5642d;
                    cVar.f5731b = m6419F(typedArray, index, cVar.f5731b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f5642d.f5733d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f5642d.f5733d = C0022c.f60c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    aVar.f5642d.f5735f = typedArray.getInt(index, 0);
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    c cVar2 = aVar.f5642d;
                    cVar2.f5738i = typedArray.getFloat(index, cVar2.f5738i);
                    break;
                case 68:
                    d dVar4 = aVar.f5641c;
                    dVar4.f5748e = typedArray.getFloat(index, dVar4.f5748e);
                    break;
                case 69:
                    aVar.f5643e.f5697f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f5643e.f5699g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f5643e;
                    bVar49.f5701h0 = typedArray.getInt(index, bVar49.f5701h0);
                    break;
                case 73:
                    b bVar50 = aVar.f5643e;
                    bVar50.f5703i0 = typedArray.getDimensionPixelSize(index, bVar50.f5703i0);
                    break;
                case 74:
                    aVar.f5643e.f5709l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f5643e;
                    bVar51.f5717p0 = typedArray.getBoolean(index, bVar51.f5717p0);
                    break;
                case 76:
                    c cVar3 = aVar.f5642d;
                    cVar3.f5734e = typedArray.getInt(index, cVar3.f5734e);
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                    aVar.f5643e.f5711m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f5641c;
                    dVar5.f5746c = typedArray.getInt(index, dVar5.f5746c);
                    break;
                case 79:
                    c cVar4 = aVar.f5642d;
                    cVar4.f5736g = typedArray.getFloat(index, cVar4.f5736g);
                    break;
                case 80:
                    b bVar52 = aVar.f5643e;
                    bVar52.f5713n0 = typedArray.getBoolean(index, bVar52.f5713n0);
                    break;
                case 81:
                    b bVar53 = aVar.f5643e;
                    bVar53.f5715o0 = typedArray.getBoolean(index, bVar53.f5715o0);
                    break;
                case 82:
                    c cVar5 = aVar.f5642d;
                    cVar5.f5732c = typedArray.getInteger(index, cVar5.f5732c);
                    break;
                case 83:
                    e eVar12 = aVar.f5644f;
                    eVar12.f5758i = m6419F(typedArray, index, eVar12.f5758i);
                    break;
                case 84:
                    c cVar6 = aVar.f5642d;
                    cVar6.f5740k = typedArray.getInteger(index, cVar6.f5740k);
                    break;
                case 85:
                    c cVar7 = aVar.f5642d;
                    cVar7.f5739j = typedArray.getFloat(index, cVar7.f5739j);
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f5642d.f5743n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f5642d;
                        if (cVar8.f5743n != -1) {
                            cVar8.f5742m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        aVar.f5642d.f5741l = typedArray.getString(index);
                        if (aVar.f5642d.f5741l.indexOf("/") > 0) {
                            aVar.f5642d.f5743n = typedArray.getResourceId(index, -1);
                            aVar.f5642d.f5742m = -2;
                            break;
                        } else {
                            aVar.f5642d.f5742m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.f5642d;
                        cVar9.f5742m = typedArray.getInteger(index, cVar9.f5743n);
                        break;
                    }
                case 87:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unused attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f5630i.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown attribute 0x");
                    sb3.append(Integer.toHexString(index));
                    sb3.append("   ");
                    sb3.append(f5630i.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f5643e;
                    bVar54.f5721s = m6419F(typedArray, index, bVar54.f5721s);
                    break;
                case 92:
                    b bVar55 = aVar.f5643e;
                    bVar55.f5722t = m6419F(typedArray, index, bVar55.f5722t);
                    break;
                case 93:
                    b bVar56 = aVar.f5643e;
                    bVar56.f5673N = typedArray.getDimensionPixelSize(index, bVar56.f5673N);
                    break;
                case 94:
                    b bVar57 = aVar.f5643e;
                    bVar57.f5680U = typedArray.getDimensionPixelSize(index, bVar57.f5680U);
                    break;
                case 95:
                    m6420G(aVar.f5643e, typedArray, index, 0);
                    break;
                case 96:
                    m6420G(aVar.f5643e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f5643e;
                    bVar58.f5719q0 = typedArray.getInt(index, bVar58.f5719q0);
                    break;
            }
        }
        b bVar59 = aVar.f5643e;
        if (bVar59.f5709l0 != null) {
            bVar59.f5707k0 = null;
        }
    }

    /* renamed from: K */
    private static void m6424K(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C32623a c32623a = new a.C32623a();
        aVar.f5646h = c32623a;
        aVar.f5642d.f5730a = false;
        aVar.f5643e.f5688b = false;
        aVar.f5641c.f5744a = false;
        aVar.f5644f.f5750a = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArray.getIndex(i11);
            switch (f5631j.get(index)) {
                case 2:
                    c32623a.m6474b(2, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5670K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(f5630i.get(index));
                    break;
                case 5:
                    c32623a.m6475c(5, typedArray.getString(index));
                    break;
                case 6:
                    c32623a.m6474b(6, typedArray.getDimensionPixelOffset(index, aVar.f5643e.f5664E));
                    break;
                case 7:
                    c32623a.m6474b(7, typedArray.getDimensionPixelOffset(index, aVar.f5643e.f5665F));
                    break;
                case 8:
                    c32623a.m6474b(8, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5671L));
                    break;
                case 11:
                    c32623a.m6474b(11, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5677R));
                    break;
                case 12:
                    c32623a.m6474b(12, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5678S));
                    break;
                case 13:
                    c32623a.m6474b(13, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5674O));
                    break;
                case 14:
                    c32623a.m6474b(14, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5676Q));
                    break;
                case 15:
                    c32623a.m6474b(15, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5679T));
                    break;
                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                    c32623a.m6474b(16, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5675P));
                    break;
                case 17:
                    c32623a.m6474b(17, typedArray.getDimensionPixelOffset(index, aVar.f5643e.f5696f));
                    break;
                case 18:
                    c32623a.m6474b(18, typedArray.getDimensionPixelOffset(index, aVar.f5643e.f5698g));
                    break;
                case 19:
                    c32623a.m6473a(19, typedArray.getFloat(index, aVar.f5643e.f5700h));
                    break;
                case 20:
                    c32623a.m6473a(20, typedArray.getFloat(index, aVar.f5643e.f5727y));
                    break;
                case 21:
                    c32623a.m6474b(21, typedArray.getLayoutDimension(index, aVar.f5643e.f5694e));
                    break;
                case 22:
                    c32623a.m6474b(22, f5629h[typedArray.getInt(index, aVar.f5641c.f5745b)]);
                    break;
                case 23:
                    c32623a.m6474b(23, typedArray.getLayoutDimension(index, aVar.f5643e.f5692d));
                    break;
                case 24:
                    c32623a.m6474b(24, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5667H));
                    break;
                case 27:
                    c32623a.m6474b(27, typedArray.getInt(index, aVar.f5643e.f5666G));
                    break;
                case 28:
                    c32623a.m6474b(28, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5668I));
                    break;
                case 31:
                    c32623a.m6474b(31, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5672M));
                    break;
                case 34:
                    c32623a.m6474b(34, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5669J));
                    break;
                case 37:
                    c32623a.m6473a(37, typedArray.getFloat(index, aVar.f5643e.f5728z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f5639a);
                    aVar.f5639a = resourceId;
                    c32623a.m6474b(38, resourceId);
                    break;
                case 39:
                    c32623a.m6473a(39, typedArray.getFloat(index, aVar.f5643e.f5682W));
                    break;
                case 40:
                    c32623a.m6473a(40, typedArray.getFloat(index, aVar.f5643e.f5681V));
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                    c32623a.m6474b(41, typedArray.getInt(index, aVar.f5643e.f5683X));
                    break;
                case 42:
                    c32623a.m6474b(42, typedArray.getInt(index, aVar.f5643e.f5684Y));
                    break;
                case 43:
                    c32623a.m6473a(43, typedArray.getFloat(index, aVar.f5641c.f5747d));
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    c32623a.m6476d(44, true);
                    c32623a.m6473a(44, typedArray.getDimension(index, aVar.f5644f.f5763n));
                    break;
                case 45:
                    c32623a.m6473a(45, typedArray.getFloat(index, aVar.f5644f.f5752c));
                    break;
                case 46:
                    c32623a.m6473a(46, typedArray.getFloat(index, aVar.f5644f.f5753d));
                    break;
                case 47:
                    c32623a.m6473a(47, typedArray.getFloat(index, aVar.f5644f.f5754e));
                    break;
                case 48:
                    c32623a.m6473a(48, typedArray.getFloat(index, aVar.f5644f.f5755f));
                    break;
                case 49:
                    c32623a.m6473a(49, typedArray.getDimension(index, aVar.f5644f.f5756g));
                    break;
                case 50:
                    c32623a.m6473a(50, typedArray.getDimension(index, aVar.f5644f.f5757h));
                    break;
                case 51:
                    c32623a.m6473a(51, typedArray.getDimension(index, aVar.f5644f.f5759j));
                    break;
                case 52:
                    c32623a.m6473a(52, typedArray.getDimension(index, aVar.f5644f.f5760k));
                    break;
                case 53:
                    c32623a.m6473a(53, typedArray.getDimension(index, aVar.f5644f.f5761l));
                    break;
                case 54:
                    c32623a.m6474b(54, typedArray.getInt(index, aVar.f5643e.f5685Z));
                    break;
                case 55:
                    c32623a.m6474b(55, typedArray.getInt(index, aVar.f5643e.f5687a0));
                    break;
                case 56:
                    c32623a.m6474b(56, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5689b0));
                    break;
                case 57:
                    c32623a.m6474b(57, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5691c0));
                    break;
                case 58:
                    c32623a.m6474b(58, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5693d0));
                    break;
                case 59:
                    c32623a.m6474b(59, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5695e0));
                    break;
                case 60:
                    c32623a.m6473a(60, typedArray.getFloat(index, aVar.f5644f.f5751b));
                    break;
                case 62:
                    c32623a.m6474b(62, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5662C));
                    break;
                case 63:
                    c32623a.m6473a(63, typedArray.getFloat(index, aVar.f5643e.f5663D));
                    break;
                case 64:
                    c32623a.m6474b(64, m6419F(typedArray, index, aVar.f5642d.f5731b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c32623a.m6475c(65, typedArray.getString(index));
                        break;
                    } else {
                        c32623a.m6475c(65, C0022c.f60c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                    c32623a.m6474b(66, typedArray.getInt(index, 0));
                    break;
                case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                    c32623a.m6473a(67, typedArray.getFloat(index, aVar.f5642d.f5738i));
                    break;
                case 68:
                    c32623a.m6473a(68, typedArray.getFloat(index, aVar.f5641c.f5748e));
                    break;
                case 69:
                    c32623a.m6473a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c32623a.m6473a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c32623a.m6474b(72, typedArray.getInt(index, aVar.f5643e.f5701h0));
                    break;
                case 73:
                    c32623a.m6474b(73, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5703i0));
                    break;
                case 74:
                    c32623a.m6475c(74, typedArray.getString(index));
                    break;
                case 75:
                    c32623a.m6476d(75, typedArray.getBoolean(index, aVar.f5643e.f5717p0));
                    break;
                case 76:
                    c32623a.m6474b(76, typedArray.getInt(index, aVar.f5642d.f5734e));
                    break;
                case ZVideoUtilMetadata.FF_PROFILE_H264_MAIN /* 77 */:
                    c32623a.m6475c(77, typedArray.getString(index));
                    break;
                case 78:
                    c32623a.m6474b(78, typedArray.getInt(index, aVar.f5641c.f5746c));
                    break;
                case 79:
                    c32623a.m6473a(79, typedArray.getFloat(index, aVar.f5642d.f5736g));
                    break;
                case 80:
                    c32623a.m6476d(80, typedArray.getBoolean(index, aVar.f5643e.f5713n0));
                    break;
                case 81:
                    c32623a.m6476d(81, typedArray.getBoolean(index, aVar.f5643e.f5715o0));
                    break;
                case 82:
                    c32623a.m6474b(82, typedArray.getInteger(index, aVar.f5642d.f5732c));
                    break;
                case 83:
                    c32623a.m6474b(83, m6419F(typedArray, index, aVar.f5644f.f5758i));
                    break;
                case 84:
                    c32623a.m6474b(84, typedArray.getInteger(index, aVar.f5642d.f5740k));
                    break;
                case 85:
                    c32623a.m6473a(85, typedArray.getFloat(index, aVar.f5642d.f5739j));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        aVar.f5642d.f5743n = typedArray.getResourceId(index, -1);
                        c32623a.m6474b(89, aVar.f5642d.f5743n);
                        c cVar = aVar.f5642d;
                        if (cVar.f5743n != -1) {
                            cVar.f5742m = -2;
                            c32623a.m6474b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i12 == 3) {
                        aVar.f5642d.f5741l = typedArray.getString(index);
                        c32623a.m6475c(90, aVar.f5642d.f5741l);
                        if (aVar.f5642d.f5741l.indexOf("/") > 0) {
                            aVar.f5642d.f5743n = typedArray.getResourceId(index, -1);
                            c32623a.m6474b(89, aVar.f5642d.f5743n);
                            aVar.f5642d.f5742m = -2;
                            c32623a.m6474b(88, -2);
                            break;
                        } else {
                            aVar.f5642d.f5742m = -1;
                            c32623a.m6474b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.f5642d;
                        cVar2.f5742m = typedArray.getInteger(index, cVar2.f5743n);
                        c32623a.m6474b(88, aVar.f5642d.f5742m);
                        break;
                    }
                case 87:
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("unused attribute 0x");
                    sb3.append(Integer.toHexString(index));
                    sb3.append("   ");
                    sb3.append(f5630i.get(index));
                    break;
                case 93:
                    c32623a.m6474b(93, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5673N));
                    break;
                case 94:
                    c32623a.m6474b(94, typedArray.getDimensionPixelSize(index, aVar.f5643e.f5680U));
                    break;
                case 95:
                    m6420G(c32623a, typedArray, index, 0);
                    break;
                case 96:
                    m6420G(c32623a, typedArray, index, 1);
                    break;
                case 97:
                    c32623a.m6474b(97, typedArray.getInt(index, aVar.f5643e.f5719q0));
                    break;
                case 98:
                    if (MotionLayout.f4934r1) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f5639a);
                        aVar.f5639a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f5640b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f5640b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f5639a = typedArray.getResourceId(index, aVar.f5639a);
                        break;
                    }
                case 99:
                    c32623a.m6476d(99, typedArray.getBoolean(index, aVar.f5643e.f5702i));
                    break;
            }
        }
    }

    /* renamed from: N */
    public static void m6425N(a aVar, int i11, float f11) {
        if (i11 != 19) {
            if (i11 != 20) {
                if (i11 != 37) {
                    if (i11 != 60) {
                        if (i11 != 63) {
                            if (i11 != 79) {
                                if (i11 != 85) {
                                    if (i11 != 39) {
                                        if (i11 != 40) {
                                            switch (i11) {
                                                case 43:
                                                    aVar.f5641c.f5747d = f11;
                                                    return;
                                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                                    e eVar = aVar.f5644f;
                                                    eVar.f5763n = f11;
                                                    eVar.f5762m = true;
                                                    return;
                                                case 45:
                                                    aVar.f5644f.f5752c = f11;
                                                    return;
                                                case 46:
                                                    aVar.f5644f.f5753d = f11;
                                                    return;
                                                case 47:
                                                    aVar.f5644f.f5754e = f11;
                                                    return;
                                                case 48:
                                                    aVar.f5644f.f5755f = f11;
                                                    return;
                                                case 49:
                                                    aVar.f5644f.f5756g = f11;
                                                    return;
                                                case 50:
                                                    aVar.f5644f.f5757h = f11;
                                                    return;
                                                case 51:
                                                    aVar.f5644f.f5759j = f11;
                                                    return;
                                                case 52:
                                                    aVar.f5644f.f5760k = f11;
                                                    return;
                                                case 53:
                                                    aVar.f5644f.f5761l = f11;
                                                    return;
                                                default:
                                                    switch (i11) {
                                                        case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                            aVar.f5642d.f5738i = f11;
                                                            return;
                                                        case 68:
                                                            aVar.f5641c.f5748e = f11;
                                                            return;
                                                        case 69:
                                                            aVar.f5643e.f5697f0 = f11;
                                                            return;
                                                        case 70:
                                                            aVar.f5643e.f5699g0 = f11;
                                                            return;
                                                        default:
                                                            return;
                                                    }
                                            }
                                        }
                                        aVar.f5643e.f5681V = f11;
                                        return;
                                    }
                                    aVar.f5643e.f5682W = f11;
                                    return;
                                }
                                aVar.f5642d.f5739j = f11;
                                return;
                            }
                            aVar.f5642d.f5736g = f11;
                            return;
                        }
                        aVar.f5643e.f5663D = f11;
                        return;
                    }
                    aVar.f5644f.f5751b = f11;
                    return;
                }
                aVar.f5643e.f5728z = f11;
                return;
            }
            aVar.f5643e.f5727y = f11;
            return;
        }
        aVar.f5643e.f5700h = f11;
    }

    /* renamed from: O */
    public static void m6426O(a aVar, int i11, int i12) {
        if (i11 != 6) {
            if (i11 != 7) {
                if (i11 != 8) {
                    if (i11 != 27) {
                        if (i11 != 28) {
                            if (i11 != 41) {
                                if (i11 != 42) {
                                    if (i11 != 61) {
                                        if (i11 != 62) {
                                            if (i11 != 72) {
                                                if (i11 != 73) {
                                                    if (i11 != 88) {
                                                        if (i11 != 89) {
                                                            switch (i11) {
                                                                case 2:
                                                                    aVar.f5643e.f5670K = i12;
                                                                    return;
                                                                case 11:
                                                                    aVar.f5643e.f5677R = i12;
                                                                    return;
                                                                case 12:
                                                                    aVar.f5643e.f5678S = i12;
                                                                    return;
                                                                case 13:
                                                                    aVar.f5643e.f5674O = i12;
                                                                    return;
                                                                case 14:
                                                                    aVar.f5643e.f5676Q = i12;
                                                                    return;
                                                                case 15:
                                                                    aVar.f5643e.f5679T = i12;
                                                                    return;
                                                                case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                                                                    aVar.f5643e.f5675P = i12;
                                                                    return;
                                                                case 17:
                                                                    aVar.f5643e.f5696f = i12;
                                                                    return;
                                                                case 18:
                                                                    aVar.f5643e.f5698g = i12;
                                                                    return;
                                                                case 31:
                                                                    aVar.f5643e.f5672M = i12;
                                                                    return;
                                                                case 34:
                                                                    aVar.f5643e.f5669J = i12;
                                                                    return;
                                                                case 38:
                                                                    aVar.f5639a = i12;
                                                                    return;
                                                                case 64:
                                                                    aVar.f5642d.f5731b = i12;
                                                                    return;
                                                                case ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE /* 66 */:
                                                                    aVar.f5642d.f5735f = i12;
                                                                    return;
                                                                case 76:
                                                                    aVar.f5642d.f5734e = i12;
                                                                    return;
                                                                case 78:
                                                                    aVar.f5641c.f5746c = i12;
                                                                    return;
                                                                case 93:
                                                                    aVar.f5643e.f5673N = i12;
                                                                    return;
                                                                case 94:
                                                                    aVar.f5643e.f5680U = i12;
                                                                    return;
                                                                case 97:
                                                                    aVar.f5643e.f5719q0 = i12;
                                                                    return;
                                                                default:
                                                                    switch (i11) {
                                                                        case 21:
                                                                            aVar.f5643e.f5694e = i12;
                                                                            return;
                                                                        case 22:
                                                                            aVar.f5641c.f5745b = i12;
                                                                            return;
                                                                        case 23:
                                                                            aVar.f5643e.f5692d = i12;
                                                                            return;
                                                                        case 24:
                                                                            aVar.f5643e.f5667H = i12;
                                                                            return;
                                                                        default:
                                                                            switch (i11) {
                                                                                case 54:
                                                                                    aVar.f5643e.f5685Z = i12;
                                                                                    return;
                                                                                case 55:
                                                                                    aVar.f5643e.f5687a0 = i12;
                                                                                    return;
                                                                                case 56:
                                                                                    aVar.f5643e.f5689b0 = i12;
                                                                                    return;
                                                                                case 57:
                                                                                    aVar.f5643e.f5691c0 = i12;
                                                                                    return;
                                                                                case 58:
                                                                                    aVar.f5643e.f5693d0 = i12;
                                                                                    return;
                                                                                case 59:
                                                                                    aVar.f5643e.f5695e0 = i12;
                                                                                    return;
                                                                                default:
                                                                                    switch (i11) {
                                                                                        case 82:
                                                                                            aVar.f5642d.f5732c = i12;
                                                                                            return;
                                                                                        case 83:
                                                                                            aVar.f5644f.f5758i = i12;
                                                                                            return;
                                                                                        case 84:
                                                                                            aVar.f5642d.f5740k = i12;
                                                                                            return;
                                                                                        default:
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                        }
                                                        aVar.f5642d.f5743n = i12;
                                                        return;
                                                    }
                                                    aVar.f5642d.f5742m = i12;
                                                    return;
                                                }
                                                aVar.f5643e.f5703i0 = i12;
                                                return;
                                            }
                                            aVar.f5643e.f5701h0 = i12;
                                            return;
                                        }
                                        aVar.f5643e.f5662C = i12;
                                        return;
                                    }
                                    aVar.f5643e.f5661B = i12;
                                    return;
                                }
                                aVar.f5643e.f5684Y = i12;
                                return;
                            }
                            aVar.f5643e.f5683X = i12;
                            return;
                        }
                        aVar.f5643e.f5668I = i12;
                        return;
                    }
                    aVar.f5643e.f5666G = i12;
                    return;
                }
                aVar.f5643e.f5671L = i12;
                return;
            }
            aVar.f5643e.f5665F = i12;
            return;
        }
        aVar.f5643e.f5664E = i12;
    }

    /* renamed from: P */
    public static void m6427P(a aVar, int i11, String str) {
        if (i11 != 5) {
            if (i11 != 65) {
                if (i11 != 74) {
                    if (i11 != 77) {
                        if (i11 == 90) {
                            aVar.f5642d.f5741l = str;
                            return;
                        }
                        return;
                    }
                    aVar.f5643e.f5711m0 = str;
                    return;
                }
                b bVar = aVar.f5643e;
                bVar.f5709l0 = str;
                bVar.f5707k0 = null;
                return;
            }
            aVar.f5642d.f5733d = str;
            return;
        }
        aVar.f5643e.f5660A = str;
    }

    /* renamed from: Q */
    public static void m6428Q(a aVar, int i11, boolean z11) {
        if (i11 != 44) {
            if (i11 != 75) {
                if (i11 != 80) {
                    if (i11 == 81) {
                        aVar.f5643e.f5715o0 = z11;
                        return;
                    }
                    return;
                }
                aVar.f5643e.f5713n0 = z11;
                return;
            }
            aVar.f5643e.f5717p0 = z11;
            return;
        }
        aVar.f5644f.f5762m = z11;
    }

    /* renamed from: m */
    public static a m6435m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, AbstractC1298f.ConstraintOverride);
        m6424K(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: t */
    private int[] m6436t(View view, String str) {
        int i11;
        Object m6381g;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i12 = 0;
        int i13 = 0;
        while (i12 < split.length) {
            String trim = split[i12].trim();
            try {
                i11 = AbstractC1297e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i11 = 0;
            }
            if (i11 == 0) {
                i11 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i11 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m6381g = ((ConstraintLayout) view.getParent()).m6381g(0, trim)) != null && (m6381g instanceof Integer)) {
                i11 = ((Integer) m6381g).intValue();
            }
            iArr[i13] = i11;
            i12++;
            i13++;
        }
        if (i13 != split.length) {
            return Arrays.copyOf(iArr, i13);
        }
        return iArr;
    }

    /* renamed from: u */
    private a m6437u(Context context, AttributeSet attributeSet, boolean z11) {
        int[] iArr;
        a aVar = new a();
        if (z11) {
            iArr = AbstractC1298f.ConstraintOverride;
        } else {
            iArr = AbstractC1298f.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m6423J(context, aVar, obtainStyledAttributes, z11);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: v */
    private a m6438v(int i11) {
        if (!this.f5638g.containsKey(Integer.valueOf(i11))) {
            this.f5638g.put(Integer.valueOf(i11), new a());
        }
        return (a) this.f5638g.get(Integer.valueOf(i11));
    }

    /* renamed from: A */
    public int m6439A(int i11) {
        return m6438v(i11).f5641c.f5745b;
    }

    /* renamed from: B */
    public int m6440B(int i11) {
        return m6438v(i11).f5641c.f5746c;
    }

    /* renamed from: C */
    public int m6441C(int i11) {
        return m6438v(i11).f5643e.f5692d;
    }

    /* renamed from: D */
    public void m6442D(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        a m6437u = m6437u(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            m6437u.f5643e.f5686a = true;
                        }
                        this.f5638g.put(Integer.valueOf(m6437u.f5639a), m6437u);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:            continue;     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6443E(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c11 = 65535;
                    if (eventType != 2) {
                        if (eventType == 3) {
                            String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                            }
                            if (c11 != 0) {
                                if (c11 == 1 || c11 == 2 || c11 == 3) {
                                    this.f5638g.put(Integer.valueOf(aVar.f5639a), aVar);
                                    aVar = null;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c11 = 6;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c11 = 7;
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c11 = 5;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c11 = '\t';
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c11 = '\b';
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c11) {
                            case 0:
                                aVar = m6437u(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                aVar = m6437u(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                aVar = m6437u(context, Xml.asAttributeSet(xmlPullParser), false);
                                b bVar = aVar.f5643e;
                                bVar.f5686a = true;
                                bVar.f5688b = true;
                                break;
                            case 3:
                                aVar = m6437u(context, Xml.asAttributeSet(xmlPullParser), false);
                                aVar.f5643e.f5705j0 = 1;
                                break;
                            case 4:
                                if (aVar != null) {
                                    aVar.f5641c.m6483b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 5:
                                if (aVar != null) {
                                    aVar.f5644f.m6485b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 6:
                                if (aVar != null) {
                                    aVar.f5643e.m6479b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case 7:
                                if (aVar != null) {
                                    aVar.f5642d.m6481b(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (aVar != null) {
                                    C1293a.m6403h(context, xmlPullParser, aVar.f5645g);
                                    break;
                                } else {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: L */
    public void m6444L(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f5637f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f5638g.containsKey(Integer.valueOf(id2))) {
                this.f5638g.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f5638g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (!aVar.f5643e.f5688b) {
                    aVar.m6467g(id2, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f5643e.f5707k0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f5643e.f5717p0 = barrier.getAllowsGoneWidget();
                            aVar.f5643e.f5701h0 = barrier.getType();
                            aVar.f5643e.f5703i0 = barrier.getMargin();
                        }
                    }
                    aVar.f5643e.f5688b = true;
                }
                d dVar = aVar.f5641c;
                if (!dVar.f5744a) {
                    dVar.f5745b = childAt.getVisibility();
                    aVar.f5641c.f5747d = childAt.getAlpha();
                    aVar.f5641c.f5744a = true;
                }
                e eVar = aVar.f5644f;
                if (!eVar.f5750a) {
                    eVar.f5750a = true;
                    eVar.f5751b = childAt.getRotation();
                    aVar.f5644f.f5752c = childAt.getRotationX();
                    aVar.f5644f.f5753d = childAt.getRotationY();
                    aVar.f5644f.f5754e = childAt.getScaleX();
                    aVar.f5644f.f5755f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f5644f;
                        eVar2.f5756g = pivotX;
                        eVar2.f5757h = pivotY;
                    }
                    aVar.f5644f.f5759j = childAt.getTranslationX();
                    aVar.f5644f.f5760k = childAt.getTranslationY();
                    aVar.f5644f.f5761l = childAt.getTranslationZ();
                    e eVar3 = aVar.f5644f;
                    if (eVar3.f5762m) {
                        eVar3.f5763n = childAt.getElevation();
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public void m6445M(C1295c c1295c) {
        for (Integer num : c1295c.f5638g.keySet()) {
            int intValue = num.intValue();
            a aVar = (a) c1295c.f5638g.get(num);
            if (!this.f5638g.containsKey(Integer.valueOf(intValue))) {
                this.f5638g.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = (a) this.f5638g.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.f5643e;
                if (!bVar.f5688b) {
                    bVar.m6478a(aVar.f5643e);
                }
                d dVar = aVar2.f5641c;
                if (!dVar.f5744a) {
                    dVar.m6482a(aVar.f5641c);
                }
                e eVar = aVar2.f5644f;
                if (!eVar.f5750a) {
                    eVar.m6484a(aVar.f5644f);
                }
                c cVar = aVar2.f5642d;
                if (!cVar.f5730a) {
                    cVar.m6480a(aVar.f5642d);
                }
                for (String str : aVar.f5645g.keySet()) {
                    if (!aVar2.f5645g.containsKey(str)) {
                        aVar2.f5645g.put(str, (C1293a) aVar.f5645g.get(str));
                    }
                }
            }
        }
    }

    /* renamed from: R */
    public void m6446R(boolean z11) {
        this.f5637f = z11;
    }

    /* renamed from: S */
    public void m6447S(boolean z11) {
        this.f5632a = z11;
    }

    /* renamed from: g */
    public void m6448g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f5638g.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("id unknown ");
                sb2.append(AbstractC1261a.m6060d(childAt));
            } else {
                if (this.f5637f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f5638g.containsKey(Integer.valueOf(id2)) && (aVar = (a) this.f5638g.get(Integer.valueOf(id2))) != null) {
                    C1293a.m6404i(childAt, aVar.f5645g);
                }
            }
        }
    }

    /* renamed from: h */
    public void m6449h(C1295c c1295c) {
        for (a aVar : c1295c.f5638g.values()) {
            if (aVar.f5646h != null) {
                if (aVar.f5640b != null) {
                    Iterator it = this.f5638g.keySet().iterator();
                    while (it.hasNext()) {
                        a m6460w = m6460w(((Integer) it.next()).intValue());
                        String str = m6460w.f5643e.f5711m0;
                        if (str != null && aVar.f5640b.matches(str)) {
                            aVar.f5646h.m6477e(m6460w);
                            m6460w.f5645g.putAll((HashMap) aVar.f5645g.clone());
                        }
                    }
                } else {
                    aVar.f5646h.m6477e(m6460w(aVar.f5639a));
                }
            }
        }
    }

    /* renamed from: i */
    public void m6450i(ConstraintLayout constraintLayout) {
        m6452k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* renamed from: j */
    public void m6451j(ConstraintHelper constraintHelper, C3186e c3186e, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        a aVar;
        int id2 = constraintHelper.getId();
        if (this.f5638g.containsKey(Integer.valueOf(id2)) && (aVar = (a) this.f5638g.get(Integer.valueOf(id2))) != null && (c3186e instanceof C3191j)) {
            constraintHelper.mo5936p(aVar, (C3191j) c3186e, layoutParams, sparseArray);
        }
    }

    /* renamed from: k */
    public void m6452k(ConstraintLayout constraintLayout, boolean z11) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f5638g.keySet());
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!this.f5638g.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("id unknown ");
                sb2.append(AbstractC1261a.m6060d(childAt));
            } else {
                if (this.f5637f && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f5638g.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f5638g.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f5643e.f5705j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f5643e.f5701h0);
                                barrier.setMargin(aVar.f5643e.f5703i0);
                                barrier.setAllowsGoneWidget(aVar.f5643e.f5717p0);
                                b bVar = aVar.f5643e;
                                int[] iArr = bVar.f5707k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f5709l0;
                                    if (str != null) {
                                        bVar.f5707k0 = m6436t(barrier, str);
                                        barrier.setReferencedIds(aVar.f5643e.f5707k0);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.m6390c();
                            aVar.m6471e(layoutParams);
                            if (z11) {
                                C1293a.m6404i(childAt, aVar.f5645g);
                            }
                            childAt.setLayoutParams(layoutParams);
                            d dVar = aVar.f5641c;
                            if (dVar.f5746c == 0) {
                                childAt.setVisibility(dVar.f5745b);
                            }
                            childAt.setAlpha(aVar.f5641c.f5747d);
                            childAt.setRotation(aVar.f5644f.f5751b);
                            childAt.setRotationX(aVar.f5644f.f5752c);
                            childAt.setRotationY(aVar.f5644f.f5753d);
                            childAt.setScaleX(aVar.f5644f.f5754e);
                            childAt.setScaleY(aVar.f5644f.f5755f);
                            e eVar = aVar.f5644f;
                            if (eVar.f5758i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f5644f.f5758i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f5756g)) {
                                    childAt.setPivotX(aVar.f5644f.f5756g);
                                }
                                if (!Float.isNaN(aVar.f5644f.f5757h)) {
                                    childAt.setPivotY(aVar.f5644f.f5757h);
                                }
                            }
                            childAt.setTranslationX(aVar.f5644f.f5759j);
                            childAt.setTranslationY(aVar.f5644f.f5760k);
                            childAt.setTranslationZ(aVar.f5644f.f5761l);
                            e eVar2 = aVar.f5644f;
                            if (eVar2.f5762m) {
                                childAt.setElevation(eVar2.f5763n);
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("WARNING NO CONSTRAINTS for view ");
                        sb3.append(id2);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = (a) this.f5638g.get(num);
            if (aVar2 != null) {
                if (aVar2.f5643e.f5705j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar2 = aVar2.f5643e;
                    int[] iArr2 = bVar2.f5707k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f5709l0;
                        if (str2 != null) {
                            bVar2.f5707k0 = m6436t(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f5643e.f5707k0);
                        }
                    }
                    barrier2.setType(aVar2.f5643e.f5701h0);
                    barrier2.setMargin(aVar2.f5643e.f5703i0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m6368x();
                    aVar2.m6471e(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f5643e.f5686a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.m6471e(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = constraintLayout.getChildAt(i12);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo5941i(constraintLayout);
            }
        }
    }

    /* renamed from: l */
    public void m6453l(int i11, ConstraintLayout.LayoutParams layoutParams) {
        a aVar;
        if (this.f5638g.containsKey(Integer.valueOf(i11)) && (aVar = (a) this.f5638g.get(Integer.valueOf(i11))) != null) {
            aVar.m6471e(layoutParams);
        }
    }

    /* renamed from: n */
    public void m6454n(int i11, int i12) {
        a aVar;
        if (!this.f5638g.containsKey(Integer.valueOf(i11)) || (aVar = (a) this.f5638g.get(Integer.valueOf(i11))) == null) {
            return;
        }
        switch (i12) {
            case 1:
                b bVar = aVar.f5643e;
                bVar.f5706k = -1;
                bVar.f5704j = -1;
                bVar.f5667H = -1;
                bVar.f5674O = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f5643e;
                bVar2.f5710m = -1;
                bVar2.f5708l = -1;
                bVar2.f5668I = -1;
                bVar2.f5676Q = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f5643e;
                bVar3.f5714o = -1;
                bVar3.f5712n = -1;
                bVar3.f5669J = 0;
                bVar3.f5675P = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f5643e;
                bVar4.f5716p = -1;
                bVar4.f5718q = -1;
                bVar4.f5670K = 0;
                bVar4.f5677R = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f5643e;
                bVar5.f5720r = -1;
                bVar5.f5721s = -1;
                bVar5.f5722t = -1;
                bVar5.f5673N = 0;
                bVar5.f5680U = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f5643e;
                bVar6.f5723u = -1;
                bVar6.f5724v = -1;
                bVar6.f5672M = 0;
                bVar6.f5679T = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f5643e;
                bVar7.f5725w = -1;
                bVar7.f5726x = -1;
                bVar7.f5671L = 0;
                bVar7.f5678S = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f5643e;
                bVar8.f5663D = -1.0f;
                bVar8.f5662C = -1;
                bVar8.f5661B = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* renamed from: o */
    public void m6455o(Context context, int i11) {
        m6456p((ConstraintLayout) LayoutInflater.from(context).inflate(i11, (ViewGroup) null));
    }

    /* renamed from: p */
    public void m6456p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f5638g.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f5637f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f5638g.containsKey(Integer.valueOf(id2))) {
                this.f5638g.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f5638g.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f5645g = C1293a.m6402a(this.f5636e, childAt);
                aVar.m6467g(id2, layoutParams);
                aVar.f5641c.f5745b = childAt.getVisibility();
                aVar.f5641c.f5747d = childAt.getAlpha();
                aVar.f5644f.f5751b = childAt.getRotation();
                aVar.f5644f.f5752c = childAt.getRotationX();
                aVar.f5644f.f5753d = childAt.getRotationY();
                aVar.f5644f.f5754e = childAt.getScaleX();
                aVar.f5644f.f5755f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f5644f;
                    eVar.f5756g = pivotX;
                    eVar.f5757h = pivotY;
                }
                aVar.f5644f.f5759j = childAt.getTranslationX();
                aVar.f5644f.f5760k = childAt.getTranslationY();
                aVar.f5644f.f5761l = childAt.getTranslationZ();
                e eVar2 = aVar.f5644f;
                if (eVar2.f5762m) {
                    eVar2.f5763n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f5643e.f5717p0 = barrier.getAllowsGoneWidget();
                    aVar.f5643e.f5707k0 = barrier.getReferencedIds();
                    aVar.f5643e.f5701h0 = barrier.getType();
                    aVar.f5643e.f5703i0 = barrier.getMargin();
                }
            }
        }
    }

    /* renamed from: q */
    public void m6457q(C1295c c1295c) {
        this.f5638g.clear();
        for (Integer num : c1295c.f5638g.keySet()) {
            a aVar = (a) c1295c.f5638g.get(num);
            if (aVar != null) {
                this.f5638g.put(num, aVar.clone());
            }
        }
    }

    /* renamed from: r */
    public void m6458r(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f5638g.clear();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraints.getChildAt(i11);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f5637f && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f5638g.containsKey(Integer.valueOf(id2))) {
                this.f5638g.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f5638g.get(Integer.valueOf(id2));
            if (aVar != null) {
                if (childAt instanceof ConstraintHelper) {
                    aVar.m6469i((ConstraintHelper) childAt, id2, layoutParams);
                }
                aVar.m6468h(id2, layoutParams);
            }
        }
    }

    /* renamed from: s */
    public void m6459s(int i11, int i12, int i13, float f11) {
        b bVar = m6438v(i11).f5643e;
        bVar.f5661B = i12;
        bVar.f5662C = i13;
        bVar.f5663D = f11;
    }

    /* renamed from: w */
    public a m6460w(int i11) {
        if (this.f5638g.containsKey(Integer.valueOf(i11))) {
            return (a) this.f5638g.get(Integer.valueOf(i11));
        }
        return null;
    }

    /* renamed from: x */
    public int m6461x(int i11) {
        return m6438v(i11).f5643e.f5694e;
    }

    /* renamed from: y */
    public int[] m6462y() {
        Integer[] numArr = (Integer[]) this.f5638g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = numArr[i11].intValue();
        }
        return iArr;
    }

    /* renamed from: z */
    public a m6463z(int i11) {
        return m6438v(i11);
    }
}
