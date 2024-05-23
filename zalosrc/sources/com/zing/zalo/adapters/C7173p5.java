package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import c30.C3255n;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import java.io.File;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24002m;
import p471r3.C25630b;
import p485rj.C25810b;
import p588vw.C28644j;
import p611wj.C29055c;
import p611wj.C29058f;
import p716zh.C31902e9;
import th.AbstractC26683d;
import vg.C28020b3;

/* renamed from: com.zing.zalo.adapters.p5 */
/* loaded from: classes3.dex */
public class C7173p5 extends RecyclerView.AbstractC1880g {

    /* renamed from: F */
    public static final int f39252F = AbstractC23136l9.m118742r(80.0f);

    /* renamed from: G */
    private static final int f39253G = AbstractC6918a0.tag_suggest_item_position;

    /* renamed from: r */
    Context f39259r;

    /* renamed from: s */
    List f39260s;

    /* renamed from: t */
    g f39261t;

    /* renamed from: u */
    e f39262u;

    /* renamed from: w */
    C23528a f39264w;

    /* renamed from: y */
    RecyclerView f39266y;

    /* renamed from: v */
    boolean f39263v = true;

    /* renamed from: x */
    boolean f39265x = false;

    /* renamed from: z */
    private int f39267z = -1;

    /* renamed from: A */
    boolean f39254A = false;

    /* renamed from: B */
    String f39255B = "";

    /* renamed from: C */
    View.OnTouchListener f39256C = new b();

    /* renamed from: D */
    View.OnClickListener f39257D = new c();

    /* renamed from: E */
    View.OnLongClickListener f39258E = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.p5$a */
    /* loaded from: classes3.dex */
    public class a extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ StickerView f39268a;

        /* renamed from: b */
        final /* synthetic */ e f39269b;

        a(StickerView stickerView, e eVar) {
            this.f39268a = stickerView;
            this.f39269b = eVar;
        }

        @Override // vg.C28020b3.b
        /* renamed from: a */
        public void mo36247a(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo36247a(str, c25630b, interfaceC3968a, c3979l, c23995f);
            C28020b3.f130648a.m141178A(c25630b, this.f39268a, c23995f, C7173p5.this.f39254A);
            if (this.f39269b != null) {
                boolean m132398F = c25630b.m132398F();
                if (m132398F) {
                    this.f39269b.mo36467b(true);
                }
                this.f39269b.mo36466a(m132398F);
            }
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            C28020b3 c28020b3 = C28020b3.f130648a;
            StickerView stickerView = this.f39268a;
            C7173p5 c7173p5 = C7173p5.this;
            c28020b3.m141179B(c25630b, stickerView, c3979l, c7173p5.f39254A, c7173p5.f39255B, c7173p5.f39265x);
            if (this.f39269b != null) {
                boolean m132398F = c25630b.m132398F();
                if (m132398F) {
                    this.f39269b.mo36467b(true);
                }
                this.f39269b.mo36466a(m132398F);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.p5$b */
    /* loaded from: classes3.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            try {
                int action = motionEvent.getAction();
                if (action == 1 || action == 3) {
                    RecyclerView recyclerView = C7173p5.this.f39266y;
                    if (recyclerView != null) {
                        recyclerView.requestDisallowInterceptTouchEvent(false);
                    }
                    g gVar = C7173p5.this.f39261t;
                    if (gVar != null) {
                        gVar.mo36472c((C31902e9) view.getTag());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.p5$c */
    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i11;
            if (view.getTag(C7173p5.f39253G) instanceof Integer) {
                i11 = ((Integer) view.getTag(C7173p5.f39253G)).intValue();
            } else {
                i11 = -1;
            }
            g gVar = C7173p5.this.f39261t;
            if (gVar != null) {
                gVar.mo36473d((C31902e9) view.getTag(), i11, C7173p5.this.mo10003k(), C7173p5.this.f39267z);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.p5$d */
    /* loaded from: classes3.dex */
    class d implements View.OnLongClickListener {
        d() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int intValue = ((Integer) view.getTag(C7173p5.f39253G)).intValue();
            C31902e9 c31902e9 = (C31902e9) C7173p5.this.f39260s.get(intValue);
            RecyclerView recyclerView = C7173p5.this.f39266y;
            if (recyclerView != null) {
                recyclerView.requestDisallowInterceptTouchEvent(true);
            }
            if (C7173p5.this.f39261t != null && (!C3255n.m16559j() || (c31902e9.m153321m() != null && (c31902e9.m153321m().m132399G() || c31902e9.m153321m().m132398F())))) {
                C7173p5.this.f39261t.mo36471b((C31902e9) view.getTag(), intValue, C7173p5.this.mo10003k(), C7173p5.this.f39267z);
            }
            return true;
        }
    }

    /* renamed from: com.zing.zalo.adapters.p5$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        void mo36466a(boolean z11);

        /* renamed from: b */
        void mo36467b(boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.p5$f */
    /* loaded from: classes3.dex */
    public class f extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private C31902e9 f39274I;

        /* renamed from: J */
        private int f39275J;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.adapters.p5$f$a */
        /* loaded from: classes3.dex */
        public class a extends C24002m {

            /* renamed from: y0 */
            final /* synthetic */ StickerView f39277y0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, StickerView stickerView) {
                super(i11);
                this.f39277y0 = stickerView;
            }

            @Override // p379o3.C24002m
            /* renamed from: E1 */
            protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
                if (file != null) {
                    C28020b3.f130648a.m141188Q(str, file.getPath());
                    C7173p5.this.m36461P(str, file.getPath(), this.f39277y0);
                }
            }
        }

        f(View view) {
            super(view);
        }

        /* renamed from: j0 */
        private void m36468j0() {
            C25810b c25810b;
            C29058f m153316h = this.f39274I.m153316h();
            StickerView stickerView = (StickerView) this.f7784p.findViewById(AbstractC6918a0.sticker_item_element);
            if (m153316h != null) {
                c25810b = m153316h.m145131c();
            } else {
                c25810b = null;
            }
            if (AbstractC26683d.f126407z && !C7173p5.this.f39265x && c25810b != null) {
                String str = c25810b.f123105a;
                String m141209z = C28020b3.f130648a.m141209z(str);
                if (!TextUtils.isEmpty(m141209z)) {
                    C7173p5.this.m36461P(str, m141209z, stickerView);
                } else {
                    ((C23528a) C7173p5.this.f39264w.m123612r(stickerView)).m123602g(str, new a(3, stickerView));
                }
            }
        }

        /* renamed from: i0 */
        void m36469i0(C31902e9 c31902e9, int i11) {
            String str;
            C3979l m125837F1;
            e eVar;
            this.f39274I = c31902e9;
            this.f39275J = i11;
            StickerView stickerView = (StickerView) this.f7784p.findViewById(AbstractC6918a0.sticker_item_element);
            ProgressBar progressBar = (ProgressBar) this.f7784p.findViewById(AbstractC6918a0.progress_id);
            stickerView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            stickerView.setOnTouchListener(C7173p5.this.f39256C);
            stickerView.setOnClickListener(C7173p5.this.f39257D);
            stickerView.setOnLongClickListener(C7173p5.this.f39258E);
            stickerView.setTag(this.f39274I);
            stickerView.setTag(C7173p5.f39253G, Integer.valueOf(i11));
            if (this.f39274I.m153322n() == 0) {
                if (this.f39274I.m153321m() == null) {
                    return;
                }
                C25630b m143282P0 = C28644j.m143233Y().m143282P0(this.f39274I.m153321m());
                this.f39274I.m153334z(m143282P0);
                stickerView.m56980l();
                if (m143282P0.m132448z()) {
                    Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                    if (m141206w != null) {
                        stickerView.setImageBitmap(m141206w);
                    }
                } else {
                    C7173p5 c7173p5 = C7173p5.this;
                    if (!c7173p5.f39265x) {
                        if (i11 == 0) {
                            eVar = c7173p5.f39262u;
                        } else {
                            eVar = null;
                        }
                        c7173p5.m36462O(m143282P0, stickerView, progressBar, eVar);
                        if (i11 == 0) {
                            C7173p5.this.f39263v = false;
                        }
                    } else if (AbstractC24006q.m125853Z1(m143282P0.m132446x()) && (m125837F1 = AbstractC24006q.m125837F1(m143282P0.m132446x())) != null) {
                        stickerView.setImageBitmap(m125837F1.m18839c());
                    }
                    if (C7173p5.this.f39262u != null && i11 == 0 && this.f39274I.m153321m() != null && this.f39274I.m153321m().m132398F()) {
                        C7173p5.this.f39262u.mo36467b(true);
                    }
                }
            } else {
                C29058f m153316h = this.f39274I.m153316h();
                C29055c m153311c = this.f39274I.m153311c();
                if (this.f39274I.m153322n() == 7 && m153316h != null) {
                    stickerView.m56980l();
                    stickerView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    stickerView.setThumbUrl(m153316h.m145133e());
                    m36468j0();
                } else {
                    if (m153311c != null && m153311c.m145111e() != null) {
                        str = m153311c.m145111e().f123105a;
                    } else if (m153316h != null) {
                        str = m153316h.m145133e();
                    } else {
                        str = "";
                    }
                    if (!C7173p5.this.f39265x || C23999j.m125696L2(str, C23278z2.m120123e0())) {
                        ((C23528a) C7173p5.this.f39264w.m123612r(stickerView)).m123619y(str, C23278z2.m120123e0(), 10);
                    }
                }
            }
            C7173p5 c7173p52 = C7173p5.this;
            if (c7173p52.f39263v && c7173p52.f39262u != null && i11 == 0 && this.f39274I.m153321m() != null) {
                C7173p5.this.f39262u.mo36466a(this.f39274I.m153321m().m132398F());
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.p5$g */
    /* loaded from: classes3.dex */
    public interface g {
        /* renamed from: a */
        void mo36470a();

        /* renamed from: b */
        void mo36471b(C31902e9 c31902e9, int i11, int i12, int i13);

        /* renamed from: c */
        void mo36472c(C31902e9 c31902e9);

        /* renamed from: d */
        void mo36473d(C31902e9 c31902e9, int i11, int i12, int i13);
    }

    public C7173p5(Context context, List list, RecyclerView recyclerView, g gVar, e eVar) {
        this.f39264w = new C23528a(context);
        this.f39259r = context;
        this.f39260s = list;
        this.f39266y = recyclerView;
        this.f39261t = gVar;
        this.f39262u = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m36461P(String str, String str2, StickerView stickerView) {
        C25630b c25630b = new C25630b(1, 2);
        c25630b.m132428f0(str);
        c25630b.m132407Q(str2);
        stickerView.m56979j(c25630b, this.f39255B + c25630b.m132431i(), false, false, false, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        try {
            C31902e9 c31902e9 = (C31902e9) this.f39260s.get(i11);
            if (abstractC1876c0 instanceof f) {
                ((f) abstractC1876c0).m36469i0(c31902e9, i11);
            }
            this.f39267z = Math.max(this.f39267z, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new f(LayoutInflater.from(this.f39259r).inflate(AbstractC7409c0.sticker_grid_item, (ViewGroup) null));
    }

    /* renamed from: O */
    void m36462O(C25630b c25630b, StickerView stickerView, ProgressBar progressBar, e eVar) {
        if (!c25630b.m132448z()) {
            C28020b3.f130648a.m141182F(stickerView, this.f39264w, c25630b, progressBar, true, new a(stickerView, eVar));
            return;
        }
        throw new RuntimeException("Not load sticker DEFAULT by Aquery");
    }

    /* renamed from: Q */
    public void m36463Q(String str) {
        this.f39255B = str;
    }

    /* renamed from: R */
    public void m36464R(boolean z11) {
        this.f39254A = z11;
    }

    /* renamed from: S */
    public void m36465S(boolean z11) {
        boolean z12;
        if (this.f39265x != z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f39265x = z11;
        if (z12) {
            m10008p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39260s.size();
    }
}
