package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import m20.InterfaceC22717a;
import p338m2.InterfaceC22715a;
import q20.C25092o;

/* renamed from: com.zing.zalo.shortvideo.ui.view.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10623a extends ZchBaseView implements C17487o0.l, InterfaceC22717a {

    /* renamed from: A0 */
    private InterfaceC22715a f53849A0;

    /* renamed from: z0 */
    private final InterfaceC18510q f53850z0;

    public AbstractC10623a(InterfaceC18510q interfaceC18510q) {
        AbstractC19074t.m100208f(interfaceC18510q, "inflateMethod");
        this.f53850z0 = interfaceC18510q;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C25092o.f120501a.m130069i();
        m92649TI().m93092y(this);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        InterfaceC22715a interfaceC22715a = (InterfaceC22715a) this.f53850z0.mo45599Hr(layoutInflater, viewGroup, Boolean.FALSE);
        this.f53849A0 = interfaceC22715a;
        View root = interfaceC22715a.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m92649TI().m93008I1(this);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        this.f53849A0 = null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: NJ */
    public boolean mo39030NJ(int i11, KeyEvent keyEvent) {
        if (super.mo39030NJ(i11, keyEvent) || m92649TI().m93093y1(i11, keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: SK */
    public final InterfaceC22715a m55556SK() {
        return this.f53849A0;
    }

    /* renamed from: gp */
    public void mo35571gp(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
    }

    /* renamed from: o7 */
    public void mo35578o7(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if ((i11 == 4 && m92649TI().m93002G0()) || m92649TI().m93096z1(i11, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.C17487o0.l
    /* renamed from: r5 */
    public void mo35582r5(ZaloView zaloView) {
        AbstractC19074t.m100208f(zaloView, "zaloView");
    }
}
