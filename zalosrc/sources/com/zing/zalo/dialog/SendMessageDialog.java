package com.zing.zalo.dialog;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;

/* loaded from: classes3.dex */
public class SendMessageDialog extends KeyEventCallbackC17462c {

    /* renamed from: I */
    int f43695I;

    /* renamed from: J */
    int f43696J;

    /* renamed from: K */
    int f43697K;

    /* renamed from: L */
    int f43698L;

    /* renamed from: M */
    int f43699M;

    /* renamed from: N */
    int f43700N;

    /* renamed from: O */
    SendView f43701O;

    /* renamed from: P */
    InterfaceC7996a f43702P;

    /* loaded from: classes3.dex */
    public class SendView extends View {

        /* renamed from: p */
        Drawable f43703p;

        /* renamed from: q */
        Drawable f43704q;

        /* renamed from: r */
        Drawable f43705r;

        /* renamed from: s */
        Rect f43706s;

        /* renamed from: t */
        Rect f43707t;

        /* renamed from: u */
        int f43708u;

        /* renamed from: v */
        int f43709v;

        /* renamed from: w */
        int f43710w;

        /* renamed from: x */
        int f43711x;

        public SendView(Context context) {
            super(context);
            this.f43710w = 0;
            m43054a();
        }

        /* renamed from: a */
        void m43054a() {
            this.f43703p = AbstractC1388a.m6964f(getContext(), AbstractC16803z.btn_send_normal);
            this.f43704q = AbstractC1388a.m6964f(getContext(), AbstractC16803z.ic_txtbigger);
            this.f43705r = AbstractC1388a.m6964f(getContext(), AbstractC16803z.ic_txtsmaller);
            this.f43707t = new Rect();
            int intrinsicWidth = this.f43703p.getIntrinsicWidth();
            int intrinsicHeight = this.f43703p.getIntrinsicHeight();
            int i11 = SendMessageDialog.this.f43696J;
            int i12 = intrinsicHeight / 2;
            this.f43708u = i11 - i12;
            this.f43709v = i11 + i12;
            int i13 = SendMessageDialog.this.f43695I;
            int i14 = intrinsicWidth / 2;
            this.f43706s = new Rect(i13 - i14, this.f43708u, i13 + i14, this.f43709v);
            this.f43711x = (SendMessageDialog.this.f43696J - this.f43703p.getIntrinsicHeight()) - getPaddingTop();
        }

        public int getScale() {
            int i11 = this.f43711x;
            return ((i11 - this.f43710w) * 50) / i11;
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            Drawable drawable = this.f43704q;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = this.f43704q.getIntrinsicHeight();
                this.f43707t.left = (canvas.getWidth() - intrinsicWidth) / 2;
                this.f43707t.top = getPaddingTop();
                Rect rect = this.f43707t;
                rect.right = rect.left + intrinsicWidth;
                rect.bottom = rect.top + intrinsicHeight;
                this.f43704q.setBounds(rect);
                this.f43704q.draw(canvas);
            }
            Drawable drawable2 = this.f43705r;
            if (drawable2 != null) {
                int intrinsicWidth2 = drawable2.getIntrinsicWidth();
                int intrinsicHeight2 = this.f43705r.getIntrinsicHeight();
                this.f43707t.left = (canvas.getWidth() - intrinsicWidth2) / 2;
                this.f43707t.top = (canvas.getHeight() - getPaddingBottom()) - intrinsicHeight2;
                Rect rect2 = this.f43707t;
                rect2.right = rect2.left + intrinsicWidth2;
                rect2.bottom = rect2.top + intrinsicHeight2;
                this.f43705r.setBounds(rect2);
                this.f43705r.draw(canvas);
            }
            Rect rect3 = this.f43706s;
            int i11 = this.f43708u;
            int i12 = this.f43710w;
            rect3.top = i11 + i12;
            rect3.bottom = this.f43709v + i12;
            this.f43703p.setBounds(rect3);
            this.f43703p.draw(canvas);
        }

        public void setPosition(int i11) {
            this.f43710w = i11;
            int i12 = this.f43711x;
            if (i11 > i12) {
                this.f43710w = i12;
            }
            if (i11 < (-i12)) {
                this.f43710w = -i12;
            }
            invalidate();
        }
    }

    /* renamed from: com.zing.zalo.dialog.SendMessageDialog$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7996a {
        /* renamed from: a */
        void mo43055a(int i11);

        /* renamed from: b */
        void mo43056b(boolean z11);
    }

    public SendMessageDialog(Context context, int i11, int i12) {
        this(context, R.style.Theme.Translucent.NoTitleBar, i11, i12);
    }

    /* renamed from: L */
    public void m43052L(MotionEvent motionEvent) {
        InterfaceC7996a interfaceC7996a;
        try {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (interfaceC7996a = this.f43702P) != null) {
                        interfaceC7996a.mo43056b(false);
                        this.f43702P = null;
                        dismiss();
                        return;
                    }
                    return;
                }
                SendView sendView = this.f43701O;
                if (sendView != null) {
                    if (this.f43699M == 0) {
                        this.f43699M = (int) motionEvent.getY();
                    } else {
                        sendView.setPosition((int) (motionEvent.getY() - this.f43699M));
                    }
                    InterfaceC7996a interfaceC7996a2 = this.f43702P;
                    if (interfaceC7996a2 != null) {
                        interfaceC7996a2.mo43055a(this.f43701O.getScale());
                        if (motionEvent.getX() < (-this.f43700N)) {
                            this.f43702P.mo43056b(false);
                            this.f43702P = null;
                            dismiss();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            InterfaceC7996a interfaceC7996a3 = this.f43702P;
            if (interfaceC7996a3 != null) {
                interfaceC7996a3.mo43056b(true);
                this.f43702P = null;
            }
            dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public void m43053M(InterfaceC7996a interfaceC7996a) {
        this.f43702P = interfaceC7996a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92870v(1);
        m92867k().m92890I(1);
        m92867k().m92887F(131072, 131072);
        int m118742r = AbstractC23136l9.m118742r(34.0f);
        int m118742r2 = AbstractC23136l9.m118742r(160.0f);
        this.f43695I = m118742r / 2;
        this.f43696J = m118742r2 / 2;
        this.f43700N = AbstractC23136l9.m118742r(60.0f);
        WindowManager.LayoutParams m92901h = m92867k().m92901h();
        m92901h.width = m118742r;
        m92901h.height = m118742r2;
        m92901h.gravity = 51;
        if (this.f43698L + this.f43696J > AbstractC23136l9.m118713h0()) {
            this.f43698L = AbstractC23136l9.m118713h0() - this.f43696J;
        }
        m92901h.x = this.f43697K - this.f43695I;
        m92901h.y = this.f43698L - this.f43696J;
        SendView sendView = this.f43701O;
        if (sendView != null) {
            sendView.setPosition(0);
        }
        m92867k().m92912v(m92901h);
        SendView sendView2 = new SendView(m92865i());
        this.f43701O = sendView2;
        sendView2.setBackgroundResource(AbstractC16803z.send_view_background);
        this.f43701O.setPadding(0, AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(10.0f));
        m92852C(this.f43701O, new ViewGroup.LayoutParams(-1, -1));
    }

    public SendMessageDialog(Context context, int i11, int i12, int i13) {
        super(context, i11);
        this.f43697K = i12;
        this.f43698L = i13;
    }
}
