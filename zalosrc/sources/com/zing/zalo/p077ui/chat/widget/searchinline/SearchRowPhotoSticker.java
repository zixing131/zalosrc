package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import bd0.C2770a;
import com.androidquery.util.C3977j;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.p077ui.widget.C13700o2;
import java.io.File;
import java.util.Objects;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C24002m;
import p471r3.C25630b;
import p485rj.C25810b;
import p611wj.C29058f;
import p716zh.C31902e9;
import th.AbstractC26683d;
import vg.C28020b3;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public class SearchRowPhotoSticker extends SearchRow implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C2770a.a {

    /* renamed from: M */
    public static final int f61453M = AbstractC23136l9.m118742r(63.0f);

    /* renamed from: N */
    public static final int f61454N = AbstractC23136l9.m118742r(60.0f);

    /* renamed from: D */
    private C31902e9 f61455D;

    /* renamed from: E */
    private C29058f f61456E;

    /* renamed from: F */
    private InterfaceC11812b f61457F;

    /* renamed from: G */
    private final C13700o2 f61458G;

    /* renamed from: H */
    private final Rect f61459H;

    /* renamed from: I */
    private final C23528a f61460I;

    /* renamed from: J */
    private C25630b f61461J;

    /* renamed from: K */
    private String f61462K;

    /* renamed from: L */
    private String f61463L;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowPhotoSticker$a */
    /* loaded from: classes5.dex */
    public class C11811a extends C24002m {
        C11811a(int i11) {
            super(i11);
        }

        @Override // p379o3.C24002m
        /* renamed from: E1 */
        protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
            C25810b c25810b;
            String str2;
            if (SearchRowPhotoSticker.this.f61456E != null) {
                c25810b = SearchRowPhotoSticker.this.f61456E.m145131c();
            } else {
                c25810b = null;
            }
            if (c25810b != null) {
                str2 = c25810b.f123105a;
            } else {
                str2 = "";
            }
            if (file != null && !TextUtils.isEmpty(str) && Objects.equals(str, str2)) {
                C28020b3.f130648a.m141188Q(str, file.getPath());
                SearchRowPhotoSticker.this.m65649s();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowPhotoSticker$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11812b {
        /* renamed from: a */
        boolean mo65650a();

        /* renamed from: b */
        boolean mo65651b();

        /* renamed from: c */
        void mo65652c(C31902e9 c31902e9);

        /* renamed from: d */
        void mo65653d(C31902e9 c31902e9);

        /* renamed from: e */
        void mo65654e(View view, C31902e9 c31902e9);

        /* renamed from: f */
        void mo65655f(View view, C31902e9 c31902e9);
    }

    public SearchRowPhotoSticker(Context context, Rect rect, int i11, String str) {
        super(context);
        this.f61463L = "";
        this.f61459H = rect;
        this.f61460I = new C23528a(context);
        C13700o2 c13700o2 = new C13700o2(new C2770a(this, C13700o2.d.f70835q, i11, null, true, false, false, C13700o2.Companion.m76549c(), false));
        this.f61458G = c13700o2;
        c13700o2.m76538a0(rect.left, rect.top);
        this.f61463L = str;
        setOnClickListener(this);
        setOnLongClickListener(this);
        setOnTouchListener(this);
    }

    /* renamed from: n */
    private boolean m65645n() {
        InterfaceC11812b interfaceC11812b = this.f61457F;
        if (interfaceC11812b != null && !interfaceC11812b.mo65651b()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private void m65646p() {
        this.f61458G.m76530R(false);
        if (!TextUtils.isEmpty(this.f61462K)) {
            this.f61458G.m76543g0(this.f61462K);
        }
    }

    /* renamed from: q */
    private void m65647q() {
        m65646p();
        m65648r();
    }

    /* renamed from: r */
    private void m65648r() {
        C25810b c25810b;
        String str;
        if (AbstractC26683d.f126407z) {
            C29058f c29058f = this.f61456E;
            if (c29058f != null) {
                c25810b = c29058f.m145131c();
            } else {
                c25810b = null;
            }
            if (c25810b != null) {
                str = c25810b.f123105a;
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str) && !m65645n()) {
                if (TextUtils.isEmpty(C28020b3.f130648a.m141209z(str))) {
                    ((C23528a) this.f61460I.m123612r(new C3977j(getContext()))).m123602g(str, new C11811a(3));
                } else {
                    m65649s();
                }
            }
        }
    }

    /* renamed from: s */
    public void m65649s() {
        C25810b c25810b;
        try {
            C29058f c29058f = this.f61456E;
            if (c29058f != null) {
                c25810b = c29058f.m145131c();
            } else {
                c25810b = null;
            }
            if (c25810b != null) {
                if (this.f61461J == null) {
                    this.f61461J = new C25630b(1, 2);
                }
                String str = c25810b.f123105a;
                String m141209z = C28020b3.f130648a.m141209z(str);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(m141209z)) {
                    this.f61461J.m132428f0(str);
                    this.f61461J.m132407Q(m141209z);
                    this.f61458G.m76529O(this.f61461J, this.f61463L + System.currentTimeMillis() + this.f61461J.m132446x(), true, false, false, true);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        InterfaceC11812b interfaceC11812b = this.f61457F;
        if (interfaceC11812b != null && interfaceC11812b.mo65650a()) {
            return true;
        }
        return false;
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.widget.searchinline.SearchRow
    /* renamed from: e */
    public void mo65614e() {
        m65648r();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC11812b interfaceC11812b = this.f61457F;
        if (interfaceC11812b != null) {
            interfaceC11812b.mo65655f(view, this.f61455D);
        }
        m65618j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f61458G.m76530R(false);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f61458G.m76545v(canvas);
        m65615f(canvas);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        InterfaceC11812b interfaceC11812b = this.f61457F;
        if (interfaceC11812b != null) {
            interfaceC11812b.mo65654e(view, this.f61455D);
            return true;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        Rect rect = this.f61459H;
        int m76524H = rect.left + rect.right + this.f61458G.m76524H();
        Rect rect2 = this.f61459H;
        setMeasuredDimension(m76524H, rect2.top + rect2.bottom + this.f61458G.m76522E());
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC11812b interfaceC11812b;
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && (interfaceC11812b = this.f61457F) != null) {
                interfaceC11812b.mo65653d(this.f61455D);
                return false;
            }
            return false;
        }
        InterfaceC11812b interfaceC11812b2 = this.f61457F;
        if (interfaceC11812b2 != null) {
            interfaceC11812b2.mo65652c(this.f61455D);
            return false;
        }
        return false;
    }

    public void setListener(InterfaceC11812b interfaceC11812b) {
        this.f61457F = interfaceC11812b;
    }

    public void setSearchResult(C31902e9 c31902e9) {
        C29058f c29058f;
        String str;
        this.f61455D = c31902e9;
        if (c31902e9 != null) {
            c29058f = c31902e9.m153316h();
        } else {
            c29058f = null;
        }
        this.f61456E = c29058f;
        if (c29058f != null) {
            str = c29058f.m145133e();
        } else {
            str = "";
        }
        this.f61462K = str;
        m65647q();
    }
}
