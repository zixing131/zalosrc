package com.zing.zalo.bubbleview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.bubbleview.LayoutBubbleView;

/* loaded from: classes3.dex */
public class LayoutBubbleView extends LinearLayout {

    /* renamed from: p */
    InterfaceC7397a f40218p;

    /* renamed from: q */
    boolean f40219q;

    /* renamed from: r */
    View f40220r;

    /* renamed from: s */
    TextView f40221s;

    /* renamed from: com.zing.zalo.bubbleview.LayoutBubbleView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7397a {
        /* renamed from: a */
        void mo37551a(View view);

        /* renamed from: b */
        void mo37552b(View view);

        void onClick(View view);
    }

    public LayoutBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40219q = false;
    }

    /* renamed from: b */
    private void m37557b() {
        try {
            this.f40221s = (TextView) findViewById(AbstractC6918a0.tvdpn);
            this.f40220r = findViewById(AbstractC6918a0.imgClose);
            setOnClickListener(new View.OnClickListener() { // from class: zd.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LayoutBubbleView.this.m37558d(view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m37558d(View view) {
        if (this.f40219q) {
            this.f40218p.mo37552b(this);
            return;
        }
        setDeleting(true);
        InterfaceC7397a interfaceC7397a = this.f40218p;
        if (interfaceC7397a != null) {
            interfaceC7397a.onClick(this);
        }
        requestFocus();
    }

    /* renamed from: c */
    public boolean m37559c() {
        return this.f40219q;
    }

    /* renamed from: e */
    void m37560e() {
        try {
            if (this.f40219q) {
                View view = this.f40220r;
                if (view != null) {
                    view.setVisibility(0);
                }
                TextView textView = this.f40221s;
                if (textView != null) {
                    textView.setEnabled(false);
                }
            } else {
                View view2 = this.f40220r;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                TextView textView2 = this.f40221s;
                if (textView2 != null) {
                    textView2.setEnabled(true);
                }
            }
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m37557b();
    }

    public void setDeleting(boolean z11) {
        InterfaceC7397a interfaceC7397a;
        setSelected(z11);
        this.f40219q = z11;
        if (z11 && (interfaceC7397a = this.f40218p) != null) {
            interfaceC7397a.mo37551a(this);
        }
        m37560e();
    }

    public void setOnDeleteListener(InterfaceC7397a interfaceC7397a) {
        this.f40218p = interfaceC7397a;
    }
}
