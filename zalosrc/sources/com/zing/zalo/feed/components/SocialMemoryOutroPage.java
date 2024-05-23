package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import bo.C3021p1;
import bo.C3026q1;
import bo.C3044u1;
import bo.C3052w1;
import bo.C3056x1;
import br.InterfaceC3116a;
import com.showingphotolib.view.AspectRatioImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import me0.C23278z2;
import p133ek.AbstractC18458a;
import p354n3.C23528a;
import p716zh.AbstractC31969j1;

/* loaded from: classes4.dex */
public class SocialMemoryOutroPage extends BaseSocialMemoryPage implements View.OnClickListener {

    /* renamed from: B */
    RobotoTextView f45143B;

    /* renamed from: C */
    AspectRatioImageView f45144C;

    /* renamed from: D */
    View f45145D;

    /* renamed from: E */
    InterfaceC3116a f45146E;

    public SocialMemoryOutroPage(Context context) {
        super(context);
    }

    /* renamed from: j */
    private void m44520j(C3021p1 c3021p1) {
        if (this.f45143B != null && c3021p1 != null && c3021p1.f12074g != null) {
            String str = AbstractC18458a.f93019a;
            if (!str.equals("en") && !str.equals("my")) {
                this.f45143B.setText(c3021p1.f12074g.f12190a);
            } else {
                this.f45143B.setText(c3021p1.f12074g.f12191b);
            }
        }
    }

    /* renamed from: k */
    private void m44521k(C3021p1 c3021p1, C23528a c23528a) {
        if (this.f45144C == null) {
            return;
        }
        if (c3021p1 != null && !TextUtils.isEmpty(c3021p1.f12070c) && c23528a != null) {
            ((C23528a) c23528a.m123612r(this.f45144C)).m123618x(c3021p1.f12070c, C23278z2.m120129h());
            this.f45144C.setVisibility(0);
        } else {
            this.f45144C.setVisibility(8);
        }
    }

    /* renamed from: l */
    private void m44522l() {
        C3021p1 c3021p1;
        C3052w1 memoryDetailInfo = getMemoryDetailInfo();
        C3026q1 c3026q1 = null;
        if (memoryDetailInfo != null) {
            c3021p1 = memoryDetailInfo.f12305d;
        } else {
            c3021p1 = null;
        }
        if (c3021p1 != null) {
            c3026q1 = c3021p1.f12074g;
        }
        InterfaceC3116a interfaceC3116a = this.f45146E;
        if (interfaceC3116a != null && c3026q1 != null) {
            interfaceC3116a.mo15735Eh(c3026q1.f12192c, c3026q1.f12193d);
        }
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: c */
    public void mo43512c(C3056x1 c3056x1, C23528a c23528a) {
        C3052w1 c3052w1;
        super.mo43512c(c3056x1, c23528a);
        if (c3056x1 != null && (c3052w1 = c3056x1.f12358e) != null) {
            m44521k(c3052w1.f12305d, c23528a);
            m44520j(c3052w1.f12305d);
        }
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: g */
    public void mo43516g() {
        super.mo43516g();
        this.f45145D = findViewById(AbstractC6918a0.content_view);
        this.f45144C = (AspectRatioImageView) findViewById(AbstractC6918a0.img_memory);
        this.f45143B = (RobotoTextView) findViewById(AbstractC6918a0.btn_action);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    protected int getBackgroundColorDefault() {
        InterfaceC3116a interfaceC3116a = this.f45146E;
        if (interfaceC3116a != null) {
            return interfaceC3116a.mo15739tx(this.f44135w - 1);
        }
        return SocialMemoryView.f46925H1;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    public View getContentView() {
        return this.f45145D;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    int getLayoutResource() {
        return AbstractC7409c0.social_memory_outro_page_view;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage, com.zing.zalo.feed.components.InterfaceC8411v6
    public int getOverlayColor() {
        C3044u1 memoryDetailDecorInfo = getMemoryDetailDecorInfo();
        if (memoryDetailDecorInfo != null) {
            return memoryDetailDecorInfo.f12272d;
        }
        return 0;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: i */
    public void mo43517i() {
        super.mo43517i();
        this.f45143B.setOnClickListener(this);
        this.f45144C.setScaleOption(0);
        Typeface m153697b = AbstractC31969j1.m153697b(getContext(), 5);
        if (m153697b != null) {
            this.f44130r.setTypeface(m153697b);
        }
        Typeface m153697b2 = AbstractC31969j1.m153697b(getContext(), 0);
        if (m153697b != null) {
            this.f44131s.setTypeface(m153697b2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_action) {
            m44522l();
        }
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    public void setCallback(InterfaceC3116a interfaceC3116a) {
        this.f45146E = interfaceC3116a;
    }

    public SocialMemoryOutroPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SocialMemoryOutroPage(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
