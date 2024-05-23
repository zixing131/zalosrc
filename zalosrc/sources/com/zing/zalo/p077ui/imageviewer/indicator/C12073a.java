package com.zing.zalo.p077ui.imageviewer.indicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.imageviewer.indicator.C12073a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23202r9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p396ol.C24302e;

/* renamed from: com.zing.zalo.ui.imageviewer.indicator.a */
/* loaded from: classes5.dex */
public class C12073a extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    public static final int f63022A = AbstractC23136l9.m118742r(48.0f);

    /* renamed from: B */
    public static final int f63023B = AbstractC23136l9.m118742r(27.0f);

    /* renamed from: r */
    private final Context f63024r;

    /* renamed from: s */
    private List f63025s;

    /* renamed from: t */
    private int f63026t;

    /* renamed from: v */
    private final LayoutInflater f63028v;

    /* renamed from: w */
    private final C23528a f63029w;

    /* renamed from: x */
    private int f63030x;

    /* renamed from: y */
    private boolean f63031y = true;

    /* renamed from: z */
    public a f63032z = null;

    /* renamed from: u */
    private int f63027u = -1;

    /* renamed from: com.zing.zalo.ui.imageviewer.indicator.a$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo67387a(int i11);
    }

    /* renamed from: com.zing.zalo.ui.imageviewer.indicator.a$b */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.AbstractC1876c0 implements View.OnClickListener {

        /* renamed from: I */
        private int f63033I;

        /* renamed from: J */
        private int f63034J;

        /* renamed from: K */
        private int f63035K;

        /* renamed from: L */
        private boolean f63036L;

        /* renamed from: M */
        private String f63037M;

        /* renamed from: N */
        private String f63038N;

        /* renamed from: O */
        private String f63039O;

        /* renamed from: P */
        private MessageId f63040P;

        /* renamed from: Q */
        private boolean f63041Q;

        /* renamed from: R */
        public RecyclingImageView f63042R;

        /* renamed from: S */
        public View f63043S;

        /* renamed from: T */
        public View f63044T;

        /* renamed from: U */
        private C12073a f63045U;

        /* renamed from: V */
        C23528a f63046V;

        /* renamed from: W */
        Handler f63047W;

        /* renamed from: X */
        Runnable f63048X;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.imageviewer.indicator.a$b$a */
        /* loaded from: classes5.dex */
        public class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ String f63049l1;

            /* renamed from: m1 */
            final /* synthetic */ Runnable f63050m1;

            a(String str, Runnable runnable) {
                this.f63049l1 = str;
                this.f63050m1 = runnable;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                if (b.this.f63035K != -1 && TextUtils.equals(str, this.f63049l1)) {
                    if (c3979l != null && c3979l.m18839c() != null) {
                        super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                        b.this.f63041Q = true;
                        View view = b.this.f63044T;
                        if (view != null) {
                            view.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    Runnable runnable = this.f63050m1;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.imageviewer.indicator.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C32764b extends AnimatorListenerAdapter {
            C32764b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.imageviewer.indicator.a$b$c */
        /* loaded from: classes5.dex */
        public class c extends AnimatorListenerAdapter {
            c() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.imageviewer.indicator.a$b$d */
        /* loaded from: classes5.dex */
        public class d extends AnimatorListenerAdapter {
            d() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                b.this.f63043S.setVisibility(8);
            }
        }

        public b(View view) {
            super(view);
            this.f63033I = -1;
            this.f63034J = -1;
            this.f63035K = 0;
            this.f63036L = false;
            this.f63037M = "";
            this.f63038N = "";
            this.f63039O = "";
            this.f63041Q = false;
            this.f63042R = null;
            this.f63043S = null;
            this.f63044T = null;
            this.f63046V = null;
            this.f63047W = new Handler();
            this.f63048X = new Runnable() { // from class: k70.a
                @Override // java.lang.Runnable
                public final void run() {
                    C12073a.b.this.m67391E0();
                }
            };
            try {
                RecyclingImageView recyclingImageView = (RecyclingImageView) view.findViewById(AbstractC6918a0.chat_photo_indicator_item);
                this.f63042R = recyclingImageView;
                recyclingImageView.setOnClickListener(this);
                this.f63043S = view.findViewById(AbstractC6918a0.chat_photo_indicator_item_selected);
                this.f63044T = view.findViewById(AbstractC6918a0.holoCircularProgressBar);
                AbstractC23136l9.m118729m1(this.f63042R, AbstractC23222t7.f112552c);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: B0 */
        public /* synthetic */ void m67388B0() {
            MessageId messageId;
            if (C24302e.m126898v() && (messageId = this.f63040P) != null) {
                File m126896t = C24302e.m126896t(messageId.toString());
                if (m126896t.exists()) {
                    m67392F0(m126896t.getPath(), null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C0 */
        public /* synthetic */ void m67389C0() {
            m67392F0(this.f63039O, new Runnable() { // from class: k70.d
                @Override // java.lang.Runnable
                public final void run() {
                    C12073a.b.this.m67388B0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: D0 */
        public /* synthetic */ void m67390D0() {
            m67392F0(this.f63037M, new Runnable() { // from class: k70.c
                @Override // java.lang.Runnable
                public final void run() {
                    C12073a.b.this.m67389C0();
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: E0 */
        public /* synthetic */ void m67391E0() {
            try {
                if ((!TextUtils.isEmpty(this.f63038N) || !TextUtils.isEmpty(this.f63039O) || !TextUtils.isEmpty(this.f63037M)) && this.f63046V != null && this.f63042R != null) {
                    View view = this.f63044T;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.f63042R.setImageDrawable(null);
                    m67392F0(this.f63038N, new Runnable() { // from class: k70.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12073a.b.this.m67390D0();
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: F0 */
        private void m67392F0(String str, Runnable runnable) {
            int i11;
            if (this.f63046V == null) {
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                a aVar = new a(str, runnable);
                aVar.m125611h1(C12073a.m67372Q(this.f63045U.f63030x), 0);
                C23528a c23528a = (C23528a) this.f63046V.m123612r(this.f63042R);
                if (this.f63036L) {
                    i11 = 1000;
                } else {
                    i11 = 1;
                }
                ((C23528a) c23528a.m123591O(i11)).m123579C(str, C23278z2.m120119d(), aVar);
                return;
            }
            if (runnable != null) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: G0 */
        public void m67393G0() {
            m67395I0();
            this.f63033I = -1;
            this.f63034J = -1;
            this.f63035K = 0;
            this.f63036L = false;
            this.f63037M = "";
            this.f63038N = "";
            this.f63039O = "";
            this.f63041Q = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H0 */
        public void m67394H0() {
            if (this.f7784p.getLayoutParams() != null) {
                this.f7784p.getLayoutParams().width = C12073a.f63023B;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I0 */
        public void m67395I0() {
            RecyclingImageView recyclingImageView = this.f63042R;
            if (recyclingImageView != null) {
                recyclingImageView.setVisibility(8);
                this.f63042R.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f63042R.setImageDrawable(null);
            }
            View view = this.f63043S;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f63044T;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (this.f7784p.getLayoutParams() != null) {
                this.f7784p.getLayoutParams().width = 0;
            }
            Handler handler = this.f63047W;
            if (handler != null) {
                handler.removeCallbacks(this.f63048X);
            }
        }

        /* renamed from: A0 */
        public int[] m67411A0() {
            int i11;
            ItemAlbumMobile itemAlbumMobile;
            int i12 = C12073a.f63023B;
            int[] iArr = {i12, C12073a.f63022A};
            C12073a c12073a = this.f63045U;
            if (c12073a != null && c12073a.f63025s != null && (i11 = this.f63034J) >= 0 && i11 < this.f63045U.f63025s.size() && (itemAlbumMobile = (ItemAlbumMobile) this.f63045U.f63025s.get(this.f63034J)) != null) {
                iArr[0] = Math.max(C12073a.m67373R(itemAlbumMobile.f42582g0.getHeight(), itemAlbumMobile.f42582g0.getWidth()), i12);
            }
            return iArr;
        }

        /* renamed from: J0 */
        public void m67412J0() {
            RecyclingImageView recyclingImageView = this.f63042R;
            if (recyclingImageView != null) {
                recyclingImageView.setVisibility(0);
                this.f63042R.setScaleType(ImageView.ScaleType.CENTER);
                if (this.f63035K == 2) {
                    this.f63042R.setImageResource(AbstractC16803z.ic_rolled_video);
                } else {
                    this.f63042R.setImageResource(AbstractC16803z.ic_rolled_photo);
                }
            }
            View view = this.f63044T;
            if (view != null) {
                view.setVisibility(8);
            }
            Handler handler = this.f63047W;
            if (handler != null) {
                handler.removeCallbacks(this.f63048X);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0016, B:9:0x001e, B:13:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x003f, B:20:0x0047, B:22:0x004d, B:24:0x0053, B:26:0x005d, B:27:0x0062, B:29:0x0066, B:30:0x0069, B:32:0x006d, B:37:0x0073, B:39:0x0081, B:41:0x0085, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:49:0x00bb, B:52:0x00bf, B:54:0x00c8, B:55:0x00cb), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0073 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0016, B:9:0x001e, B:13:0x0029, B:15:0x002e, B:17:0x003a, B:18:0x003f, B:20:0x0047, B:22:0x004d, B:24:0x0053, B:26:0x005d, B:27:0x0062, B:29:0x0066, B:30:0x0069, B:32:0x006d, B:37:0x0073, B:39:0x0081, B:41:0x0085, B:43:0x0092, B:45:0x009a, B:47:0x00a2, B:49:0x00bb, B:52:0x00bf, B:54:0x00c8, B:55:0x00cb), top: B:2:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* renamed from: K0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m67413K0(C23528a c23528a, String str, String str2, String str3, MessageId messageId) {
            boolean z11;
            RecyclingImageView recyclingImageView;
            try {
                this.f63046V = c23528a;
                if (TextUtils.equals(str, this.f63038N) && TextUtils.equals(str2, this.f63037M) && TextUtils.equals(str3, this.f63039O) && this.f63041Q) {
                    z11 = false;
                    recyclingImageView = this.f63042R;
                    if (recyclingImageView != null) {
                        recyclingImageView.setVisibility(0);
                        this.f63042R.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        if (z11) {
                            this.f63042R.setImageDrawable(null);
                        }
                    }
                    if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
                        this.f63039O = "";
                        this.f63037M = "";
                        this.f63041Q = false;
                        Handler handler = this.f63047W;
                        if (handler != null) {
                            handler.removeCallbacks(this.f63048X);
                        }
                        View view = this.f63044T;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                        RecyclingImageView recyclingImageView2 = this.f63042R;
                        if (recyclingImageView2 != null) {
                            recyclingImageView2.setImageDrawable(null);
                            return;
                        }
                        return;
                    }
                    if (!z11) {
                        this.f63038N = str;
                        this.f63039O = str3;
                        this.f63037M = str2;
                        this.f63040P = messageId;
                        this.f63041Q = false;
                        Handler handler2 = this.f63047W;
                        if (handler2 != null && this.f63042R != null) {
                            handler2.removeCallbacks(this.f63048X);
                            C3979l m67417z0 = m67417z0(this.f63038N);
                            if (m67417z0 == null) {
                                m67417z0 = m67417z0(this.f63037M);
                            }
                            if (m67417z0 == null) {
                                m67417z0 = m67417z0(this.f63039O);
                            }
                            if (m67417z0 != null) {
                                this.f63042R.setImageBitmap(m67417z0.m18839c());
                                this.f63041Q = true;
                                AbstractC23202r9.m119540h(this.f63042R, new C32764b());
                                View view2 = this.f63044T;
                                if (view2 != null) {
                                    view2.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            this.f63042R.setImageDrawable(null);
                            View view3 = this.f63044T;
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            this.f63047W.postDelayed(this.f63048X, 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z11 = true;
                recyclingImageView = this.f63042R;
                if (recyclingImageView != null) {
                }
                if (!TextUtils.isEmpty(str)) {
                }
                if (!z11) {
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* renamed from: L0 */
        public void m67414L0(boolean z11) {
            int m118742r;
            this.f63036L = z11;
            View view = this.f63043S;
            if (view != null) {
                if (z11) {
                    AbstractC23202r9.m119539g(view, 500L, new c());
                    this.f63043S.setVisibility(0);
                } else {
                    AbstractC23202r9.m119541i(view, 500L, new d());
                }
            }
            float f11 = 1.5f;
            if (this.f63036L) {
                m118742r = AbstractC23136l9.m118742r(1.5f);
            } else {
                m118742r = AbstractC23136l9.m118742r(0.0f);
            }
            if (this.f63036L) {
                f11 = 2.0f;
            }
            int m118742r2 = AbstractC23136l9.m118742r(f11);
            this.f7784p.setPadding(m118742r, 0, m118742r, 0);
            this.f63042R.setPadding(m118742r2, m118742r2, m118742r2, m118742r2);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C12073a c12073a = this.f63045U;
            if (c12073a != null && c12073a.f63032z != null && this.f63033I == 2) {
                AbstractC23647d.m123897g("10015025");
                this.f63045U.f63032z.mo67387a(this.f63034J - 1);
            }
        }

        /* renamed from: x0 */
        public void m67415x0() {
            int i11 = this.f63033I;
            if (i11 == 2) {
                int i12 = C12073a.f63023B;
                if (this.f63036L) {
                    i12 = m67411A0()[0];
                }
                this.f7784p.getLayoutParams().width = i12;
                return;
            }
            if (i11 == 0) {
                this.f7784p.getLayoutParams().width = (AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(48.0f) * 2)) / 2;
            } else if (i11 == 1 || i11 == -1) {
                this.f7784p.getLayoutParams().width = 0;
            }
        }

        /* renamed from: y0 */
        public int m67416y0() {
            return this.f63035K;
        }

        /* renamed from: z0 */
        C3979l m67417z0(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return C23999j.m125676A2(str, C23278z2.m120119d().f116260a, C23278z2.m120119d().f116266g);
        }
    }

    public C12073a(Context context, List list) {
        this.f63024r = context;
        this.f63028v = LayoutInflater.from(context);
        this.f63029w = new C23528a(context);
        m67385a0(list, true);
    }

    /* renamed from: Q */
    static int m67372Q(int i11) {
        if (i11 != 2) {
            return i11 != 3 ? 0 : 26003;
        }
        return 26000;
    }

    /* renamed from: R */
    static int m67373R(int i11, int i12) {
        float f11 = (i11 * 1.0f) / i12;
        if (f11 < 0.64285713f) {
            f11 = 0.64285713f;
        } else if (f11 > 1.5555556f) {
            f11 = 1.5555556f;
        }
        return (int) (f63022A / f11);
    }

    /* renamed from: N */
    public void m67374N() {
        m10009q(0);
        m10009q(mo10003k() - 1);
    }

    /* renamed from: O */
    public void m67375O() {
        int i11 = this.f63026t;
        this.f63026t = -1;
        m10009q(i11);
    }

    /* renamed from: P */
    public int m67376P() {
        return this.f63026t;
    }

    /* renamed from: S */
    public int m67377S(int i11) {
        ItemAlbumMobile itemAlbumMobile;
        List list = this.f63025s;
        if (list == null || i11 >= list.size() || i11 < 0 || (itemAlbumMobile = (ItemAlbumMobile) this.f63025s.get(i11)) == null) {
            return 1;
        }
        return m67373R(itemAlbumMobile.f42582g0.getHeight(), itemAlbumMobile.f42582g0.getWidth());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        int i12;
        if (this.f63025s != null) {
            int m9929A = bVar.m9929A();
            bVar.f63033I = mo10005m(m9929A);
            bVar.f63034J = m9929A;
            int i13 = bVar.f63033I;
            if (i13 == -1 || i13 == 0) {
                bVar.m67395I0();
                bVar.m67415x0();
                return;
            }
            boolean z11 = true;
            if (i13 == 1 || i13 == 2) {
                ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f63025s.get(m9929A);
                if (itemAlbumMobile != null) {
                    i12 = itemAlbumMobile.f42591p;
                } else {
                    i12 = 0;
                }
                bVar.f63035K = i12;
                if (itemAlbumMobile == null) {
                    bVar.m67395I0();
                    return;
                }
                if (bVar.f63035K == -1) {
                    bVar.m67395I0();
                    return;
                }
                if (itemAlbumMobile.m40511V()) {
                    bVar.m67412J0();
                } else {
                    String str = itemAlbumMobile.f42548C;
                    bVar.m67413K0(this.f63029w, itemAlbumMobile.f42609y, itemAlbumMobile.f42607x, str, itemAlbumMobile.m40496C());
                }
                if (bVar.f63034J != this.f63026t) {
                    z11 = false;
                }
                bVar.m67414L0(z11);
                bVar.m67415x0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        b bVar = new b(this.f63028v.inflate(AbstractC7409c0.chat_photo_indicator_item, viewGroup, false));
        bVar.f63033I = i11;
        bVar.f63045U = this;
        bVar.m67394H0();
        bVar.m67395I0();
        return bVar;
    }

    /* renamed from: V */
    public void m67380V(ItemAlbumMobile itemAlbumMobile) {
        int i11;
        if (this.f63025s != null) {
            i11 = 0;
            while (i11 < this.f63025s.size()) {
                if (this.f63025s.get(i11) == itemAlbumMobile) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        i11 = -1;
        if (i11 >= 0) {
            m10009q(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9997H(b bVar) {
        bVar.m67393G0();
        super.mo9997H(bVar);
    }

    /* renamed from: X */
    public void m67382X(a aVar) {
        this.f63032z = aVar;
    }

    /* renamed from: Y */
    public void m67383Y(int i11, boolean z11) {
        int i12 = this.f63026t;
        if (i11 != i12 || z11) {
            this.f63027u = i12;
            this.f63026t = i11;
            m10009q(i12);
            m10009q(this.f63026t);
        }
    }

    /* renamed from: Z */
    public void m67384Z(boolean z11) {
        this.f63031y = z11;
    }

    /* renamed from: a0 */
    public void m67385a0(List list, boolean z11) {
        if (list != null) {
            this.f63025s = new ArrayList(list);
        } else {
            this.f63025s = new ArrayList();
        }
        this.f63025s.add(0, null);
        this.f63025s.add(null);
        if (z11) {
            m10008p();
        }
    }

    /* renamed from: b0 */
    public void m67386b0(int i11) {
        this.f63030x = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f63025s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        List list = this.f63025s;
        if (list == null || list.size() <= 1) {
            return -1;
        }
        if (i11 != 0 && i11 != this.f63025s.size() - 1) {
            ItemAlbumMobile itemAlbumMobile = (ItemAlbumMobile) this.f63025s.get(i11);
            if (itemAlbumMobile == null) {
                return -1;
            }
            if (itemAlbumMobile.f42591p == -1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }
}
