package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.widget.HeaderLayout;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import pm0.C24848g0;
import q10.C25058u1;
import s20.AbstractC26112n;

/* loaded from: classes5.dex */
public abstract class SimpleView extends ZchBaseView {

    /* renamed from: A0 */
    protected View f53387A0;

    /* renamed from: z0 */
    protected C25058u1 f53388z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SimpleView$a */
    /* loaded from: classes5.dex */
    static final class C10479a extends AbstractC19075u implements InterfaceC18505l {
        C10479a() {
            super(1);
        }

        /* renamed from: a */
        public final void m55015a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SimpleView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55015a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: WK */
    private final void m55009WK() {
        ViewStub viewStub = m55011UK().f120341q;
        viewStub.setLayoutResource(mo54293TK());
        View inflate = viewStub.inflate();
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        m55012XK(inflate);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25058u1 m129948c = C25058u1.m129948c(layoutInflater);
        AbstractC19074t.m100207e(m129948c, "inflate(...)");
        m55013YK(m129948c);
        HeaderLayout root = m55011UK().f120342r.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            RelativeLayout root2 = m55011UK().getRoot();
            AbstractC19074t.m100207e(root2, "getRoot(...)");
            layoutParams2.topMargin = AbstractC26112n.m134365F(root2);
            root.setLayoutParams(layoutParams2);
            m55011UK().f120342r.f119966x.setText(mo54294VK());
            if (mo55014ZK()) {
                m55011UK().f120342r.f119960r.setImageResource(AbstractC23322a.zch_ic_close_line_24);
            }
            ImageView imageView = m55011UK().f120342r.f119960r;
            AbstractC19074t.m100207e(imageView, "btnBack");
            AbstractC26112n.m134407k0(imageView, new C10479a());
            m55009WK();
            RelativeLayout root3 = m55011UK().getRoot();
            AbstractC19074t.m100207e(root3, "getRoot(...)");
            return root3;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: SK */
    public final View m55010SK() {
        View view = this.f53387A0;
        if (view != null) {
            return view;
        }
        AbstractC19074t.m100223u("childView");
        return null;
    }

    /* renamed from: TK */
    public abstract int mo54293TK();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: UK */
    public final C25058u1 m55011UK() {
        C25058u1 c25058u1 = this.f53388z0;
        if (c25058u1 != null) {
            return c25058u1;
        }
        AbstractC19074t.m100223u("simpleBinding");
        return null;
    }

    /* renamed from: VK */
    public abstract String mo54294VK();

    /* renamed from: XK */
    protected final void m55012XK(View view) {
        AbstractC19074t.m100208f(view, "<set-?>");
        this.f53387A0 = view;
    }

    /* renamed from: YK */
    protected final void m55013YK(C25058u1 c25058u1) {
        AbstractC19074t.m100208f(c25058u1, "<set-?>");
        this.f53388z0 = c25058u1;
    }

    /* renamed from: ZK */
    public boolean mo55014ZK() {
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (m92649TI().m93012K0() instanceof BaseBottomSheetView) {
            return m92649TI().m93096z1(i11, keyEvent);
        }
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
