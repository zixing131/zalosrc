package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.C1755a0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p134el.C18475n;
import p134el.C18476o;
import p134el.C18477p;
import p354n3.C23528a;
import p471r3.C25630b;
import p588vw.C28644j;
import p716zh.C31947h9;
import ui0.C27280g;
import vg.C28020b3;
import z90.InterfaceC31726a;

/* renamed from: com.zing.zalo.adapters.g7 */
/* loaded from: classes3.dex */
public class C7076g7 extends RecyclerView.AbstractC1880g {

    /* renamed from: B */
    public static final int f38681B = AbstractC23136l9.m118742r(68.0f);

    /* renamed from: r */
    private InterfaceC31726a f38683r;

    /* renamed from: s */
    private C31947h9 f38684s;

    /* renamed from: t */
    private List f38685t;

    /* renamed from: u */
    private final C23528a f38686u;

    /* renamed from: y */
    public int f38690y = -1;

    /* renamed from: z */
    StickerView.InterfaceC10959a f38691z = new a();

    /* renamed from: A */
    private final View.OnTouchListener f38682A = new b();

    /* renamed from: v */
    private C1761c0 f38687v = new C1761c0();

    /* renamed from: w */
    private C1761c0 f38688w = new C1761c0();

    /* renamed from: x */
    private C1761c0 f38689x = new C1761c0();

    /* renamed from: com.zing.zalo.adapters.g7$a */
    /* loaded from: classes3.dex */
    class a implements StickerView.InterfaceC10959a {
        a() {
        }

        @Override // com.zing.zalo.p077ui.StickerView.InterfaceC10959a
        /* renamed from: a */
        public boolean mo35967a() {
            if (C7076g7.this.f38683r != null && C7076g7.this.f38683r.mo16634a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.g7$b */
    /* loaded from: classes3.dex */
    class b implements View.OnTouchListener {
        b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view != null && motionEvent != null) {
                try {
                    int action = motionEvent.getAction();
                    if ((action == 1 || action == 3) && (view instanceof StickerView)) {
                        if (C7076g7.this.f38683r != null) {
                            C7076g7.this.f38683r.mo16641h(((StickerView) view).getEmoticon());
                        }
                        if (C7076g7.this.f38689x != null) {
                            C7076g7.this.f38689x.mo9224q(new C18477p(((StickerView) view).getEmoticon()));
                            return false;
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.adapters.g7$c */
    /* loaded from: classes3.dex */
    private static class c extends RecyclerView.AbstractC1876c0 {
        public c(View view) {
            super(view);
        }
    }

    public C7076g7(Context context, final C1755a0 c1755a0) {
        this.f38686u = new C23528a(context);
        C1761c0 c1761c0 = this.f38687v;
        Objects.requireNonNull(c1755a0);
        c1755a0.m9256r(c1761c0, new InterfaceC1764d0() { // from class: com.zing.zalo.adapters.z6
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                C1755a0.this.mo9224q((C18475n) obj);
            }
        });
        c1755a0.m9256r(this.f38688w, new InterfaceC1764d0() { // from class: com.zing.zalo.adapters.a7
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                C1755a0.this.mo9224q((C18476o) obj);
            }
        });
        c1755a0.m9256r(this.f38689x, new InterfaceC1764d0() { // from class: com.zing.zalo.adapters.b7
            @Override // androidx.lifecycle.InterfaceC1764d0
            /* renamed from: qp */
            public final void mo8524qp(Object obj) {
                C1755a0.this.mo9224q((C18477p) obj);
            }
        });
    }

    /* renamed from: R */
    private View m36118R(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112562h);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        Drawable m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_touch_line_24, AbstractC2807a.icon_02);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(AbstractC23222t7.f112566j);
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setImageDrawable(m139660c);
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
        robotoTextView.mo75850g(true);
        robotoTextView.setText(context.getString(AbstractC8020f0.str_desc_tooltip_preview_sticker));
        robotoTextView.setTextSize(1, 13.0f);
        robotoTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.text_02));
        robotoTextView.setLineSpacing(AbstractC23136l9.m118759w1(3), 0.0f);
        robotoTextView.setTranslationY(AbstractC23136l9.m118748t(context, -1.38f));
        linearLayout2.addView(appCompatImageView);
        linearLayout2.addView(robotoTextView);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m36119S(C25630b c25630b, StickerView stickerView) {
        C28020b3.f130648a.m141183G(c25630b, this.f38686u, stickerView, null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m36120T(final StickerView stickerView, final C25630b c25630b) {
        AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.adapters.f7
            @Override // java.lang.Runnable
            public final void run() {
                C7076g7.this.m36119S(c25630b, stickerView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m36121U(C25630b c25630b, int i11, View view) {
        if (!(view instanceof StickerView)) {
            return;
        }
        C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
        if (this.f38683r != null && m143290W.m132425e() > 0) {
            this.f38683r.mo16639f((StickerView) view, i11);
        }
        if (this.f38687v != null && m143290W.m132425e() > 0) {
            this.f38687v.mo9224q(new C18475n((StickerView) view, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ boolean m36122V(C25630b c25630b, int i11, View view) {
        if (!(view instanceof StickerView)) {
            return false;
        }
        C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
        if (this.f38683r != null && m143290W.m132425e() > 0) {
            this.f38683r.mo16640g((StickerView) view, i11, 4);
        }
        if (this.f38688w != null && m143290W.m132425e() > 0) {
            this.f38688w.mo9224q(new C18476o((StickerView) view, i11, 4));
            return true;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if (i11 == 0) {
            ((C23528a) this.f38686u.m123612r((RecyclingImageView) abstractC1876c0.f7784p)).m123616v(this.f38684s.m153579a());
            return;
        }
        if (i11 >= 2) {
            final StickerView stickerView = (StickerView) abstractC1876c0.f7784p;
            int i12 = i11 - 2;
            stickerView.setRowIndex(i12 / 4);
            stickerView.setIndicatorIndex(this.f38690y);
            final C25630b c25630b = (C25630b) this.f38685t.get(i12);
            try {
                C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
                if (m143290W.m132427f() > 0) {
                    C28020b3.f130648a.m141183G(m143290W, this.f38686u, stickerView, null, true);
                } else {
                    C28644j.m143233Y().m143281O0(c25630b, this, new C28644j.m() { // from class: com.zing.zalo.adapters.c7
                        @Override // p588vw.C28644j.m
                        /* renamed from: a */
                        public final void mo35936a(C25630b c25630b2) {
                            C7076g7.this.m36120T(stickerView, c25630b2);
                        }
                    });
                }
                final int m132432j = c25630b.m132432j();
                stickerView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.d7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7076g7.this.m36121U(c25630b, m132432j, view);
                    }
                });
                stickerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.e7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m36122V;
                        m36122V = C7076g7.this.m36122V(c25630b, m132432j, view);
                        return m36122V;
                    }
                });
                stickerView.setOnTouchListener(this.f38682A);
                stickerView.setEmoticon(String.valueOf(c25630b.m132429g()));
                stickerView.setTag(c25630b);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        RecyclingImageView recyclingImageView;
        View view;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    view = null;
                } else {
                    StickerView stickerView = new StickerView(viewGroup.getContext());
                    stickerView.setDelegate(this.f38691z);
                    stickerView.setLayoutParams(new RecyclerView.LayoutParams(-1, f38681B));
                    recyclingImageView = stickerView;
                }
            } else {
                view = m36118R(viewGroup.getContext());
            }
            return new c(view);
        }
        RecyclingImageView recyclingImageView2 = new RecyclingImageView(viewGroup.getContext());
        recyclingImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        recyclingImageView2.setAdjustViewBounds(true);
        recyclingImageView2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        recyclingImageView = recyclingImageView2;
        view = recyclingImageView;
        return new c(view);
    }

    /* renamed from: W */
    public void m36123W(C31947h9 c31947h9) {
        this.f38684s = c31947h9;
        if (c31947h9 != null) {
            this.f38685t = new ArrayList(this.f38684s.m153586h());
        }
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        if (this.f38684s == null) {
            return 0;
        }
        return this.f38685t.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? 2 : 1;
        }
        return 0;
    }
}
