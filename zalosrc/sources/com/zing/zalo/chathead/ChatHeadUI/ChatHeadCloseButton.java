package com.zing.zalo.chathead.ChatHeadUI;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC16803z;
import kg.AbstractC21707d;
import kg.AbstractC21717n;
import kg.C21709f;
import kg.C21715l;
import p209hg.C20052c;
import p266jg.AbstractC21245c;

/* loaded from: classes3.dex */
public class ChatHeadCloseButton extends AppCompatImageView {

    /* renamed from: p */
    int f42042p;

    /* renamed from: q */
    int f42043q;

    /* renamed from: r */
    C21709f f42044r;

    /* renamed from: s */
    C21709f f42045s;

    /* renamed from: t */
    C21709f f42046t;

    /* renamed from: u */
    boolean f42047u;

    /* renamed from: v */
    C20052c f42048v;

    /* renamed from: w */
    public int f42049w;

    /* renamed from: x */
    public int f42050x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHeadCloseButton$a */
    /* loaded from: classes3.dex */
    public class C7837a extends AbstractC21707d {

        /* renamed from: p */
        final /* synthetic */ C20052c f42051p;

        C7837a(C20052c c20052c) {
            this.f42051p = c20052c;
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            this.f42051p.m104164m().m106803z(ChatHeadCloseButton.this, ChatHeadCloseButton.this.m39838i(c21709f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHeadCloseButton$b */
    /* loaded from: classes3.dex */
    public class C7838b extends AbstractC21707d {

        /* renamed from: p */
        final /* synthetic */ C20052c f42053p;

        C7838b(C20052c c20052c) {
            this.f42053p = c20052c;
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            super.mo39827a(c21709f);
            this.f42053p.m104164m().m106776A(ChatHeadCloseButton.this, ChatHeadCloseButton.this.m39839j(c21709f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.chathead.ChatHeadUI.ChatHeadCloseButton$c */
    /* loaded from: classes3.dex */
    public class C7839c extends AbstractC21707d {
        C7839c() {
        }

        @Override // kg.AbstractC21707d, kg.InterfaceC21713j
        /* renamed from: a */
        public void mo39827a(C21709f c21709f) {
            float m112033d = (float) c21709f.m112033d();
            ChatHeadCloseButton.this.setScaleX(m112033d);
            ChatHeadCloseButton.this.setScaleY(m112033d);
        }
    }

    public ChatHeadCloseButton(Context context, C20052c c20052c) {
        super(context);
        this.f42047u = true;
        m39840k(c20052c);
    }

    /* renamed from: f */
    public void m39835f() {
        if (isEnabled()) {
            if (this.f42048v.m104133H()) {
                this.f42048v.m104151d0();
            }
            this.f42046t.m112048u(AbstractC21245c.f103554a);
            this.f42045s.m112048u(AbstractC21245c.f103554a);
            this.f42044r.m112046s(0.800000011920929d);
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                if (((ViewGroup) parent).indexOfChild(this) != r0.getChildCount() - 1) {
                    bringToFront();
                }
            }
            this.f42047u = false;
        }
    }

    /* renamed from: g */
    public void m39836g() {
        if (this.f42048v.m104133H()) {
            this.f42048v.m104131E();
        }
        this.f42046t.m112046s((this.f42043q - this.f42050x) + this.f42048v.m104167s().f103548f);
        this.f42046t.m112048u(AbstractC21245c.f103555b);
        this.f42045s.m112046s(0.0d);
        this.f42044r.m112046s(0.10000000149011612d);
        this.f42047u = true;
    }

    public int getEndValueX() {
        return m39838i(this.f42045s);
    }

    public int getEndValueY() {
        return m39839j(this.f42046t);
    }

    public C21709f getxSpring() {
        return this.f42045s;
    }

    public C21709f getySpring() {
        return this.f42046t;
    }

    /* renamed from: h */
    double m39837h(double d11, float f11, int i11) {
        float f12 = f11 * i11;
        return AbstractC21717n.m112064b(d11, 0.0d, i11, (-f12) / 2.0f, f12 / 2.0f);
    }

    /* renamed from: i */
    int m39838i(C21709f c21709f) {
        return (this.f42049w + ((int) c21709f.m112033d())) - (getMeasuredWidth() / 2);
    }

    /* renamed from: j */
    int m39839j(C21709f c21709f) {
        return (this.f42050x + ((int) c21709f.m112033d())) - (getMeasuredHeight() / 2);
    }

    /* renamed from: k */
    void m39840k(C20052c c20052c) {
        this.f42048v = c20052c;
        setImageResource(AbstractC16803z.dismiss_big);
        C21715l m112062k = C21715l.m112062k();
        C21709f m112019d = m112062k.m112019d();
        this.f42045s = m112019d;
        m112019d.m112030a(new C7837a(c20052c));
        C21709f m112019d2 = m112062k.m112019d();
        this.f42046t = m112019d2;
        m112019d2.m112030a(new C7838b(c20052c));
        C21709f m112019d3 = m112062k.m112019d();
        this.f42044r = m112019d3;
        m112019d3.m112030a(new C7839c());
        setEnabled(true);
    }

    /* renamed from: l */
    public boolean m39841l() {
        return this.f42047u;
    }

    /* renamed from: m */
    public void m39842m() {
        if (!this.f42047u) {
            this.f42044r.m112046s(1.0499999523162842d);
        }
    }

    /* renamed from: n */
    public void m39843n() {
        this.f42042p = this.f42048v.m104173z();
        this.f42043q = this.f42048v.m104172y();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m39836g();
    }

    /* renamed from: p */
    public void m39844p() {
        if (!this.f42047u) {
            this.f42044r.m112046s(0.8d);
        }
    }

    /* renamed from: q */
    public void m39845q(float f11, float f12) {
        if (isEnabled()) {
            double m39837h = m39837h(f11, 0.1f, this.f42042p);
            double m39837h2 = m39837h(f12, 0.05f, this.f42043q);
            if (!this.f42047u) {
                this.f42045s.m112046s(m39837h);
                this.f42046t.m112046s(m39837h2);
            }
        }
    }

    /* renamed from: r */
    public void m39846r(int i11, int i12) {
        if (i11 != this.f42049w || i12 != this.f42050x) {
            this.f42049w = i11;
            this.f42050x = i12;
            this.f42045s.m112045r(0.0d, false);
            this.f42046t.m112045r(0.0d, false);
        }
    }
}
