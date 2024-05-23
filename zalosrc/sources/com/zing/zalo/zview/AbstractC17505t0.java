package com.zing.zalo.zview;

import android.os.Bundle;
import android.os.Message;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.zview.ZaloView;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.zing.zalo.zview.t0 */
/* loaded from: classes7.dex */
public abstract class AbstractC17505t0 extends AbstractC6881a {

    /* renamed from: r */
    private final C17487o0 f89197r;

    /* renamed from: s */
    private ZaloView f89198s;

    /* renamed from: t */
    protected List f89199t = new ArrayList();

    /* renamed from: u */
    private final List f89200u = new ArrayList();

    /* renamed from: v */
    private final List f89201v = new ArrayList();

    public AbstractC17505t0(C17487o0 c17487o0) {
        this.f89197r = c17487o0;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        while (this.f89200u.size() <= i11) {
            this.f89200u.add(null);
        }
        ZaloView zaloView = (ZaloView) obj;
        this.f89200u.set(i11, this.f89197r.m93037U1(zaloView));
        this.f89199t.set(i11, null);
        Message m93033S = this.f89197r.m93033S(zaloView, m93129y());
        if (m93033S != null) {
            this.f89201v.add(m93033S);
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: f */
    public void mo35334f(ViewGroup viewGroup) {
        super.mo35334f(viewGroup);
        Iterator it = this.f89201v.iterator();
        while (it.hasNext()) {
            this.f89197r.f89105F.handleMessage((Message) it.next());
        }
        this.f89201v.clear();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        ZaloView.SavedState savedState;
        ZaloView zaloView;
        if (this.f89199t.size() > i11 && (zaloView = (ZaloView) this.f89199t.get(i11)) != null) {
            return zaloView;
        }
        ZaloView mo36135w = mo36135w(i11);
        if (mo36135w != null && mo36135w.f88735B == null) {
            mo36135w.f88735B = this.f89197r.f89116j;
        }
        if (this.f89200u.size() > i11 && (savedState = (ZaloView.SavedState) this.f89200u.get(i11)) != null && mo36135w != null) {
            mo36135w.f88777q = savedState.f88792p;
        }
        while (this.f89199t.size() <= i11) {
            this.f89199t.add(null);
        }
        if (mo36135w != null) {
            mo36135w.f88736C = this.f89197r;
            mo36135w.m92638DK(false);
            this.f89199t.set(i11, mo36135w);
            Message m93035T = this.f89197r.m93035T(viewGroup.getId(), mo36135w, null, 0, null, mo93130z(), false);
            if (m93035T != null) {
                this.f89201v.add(m93035T);
            }
        }
        if (mo36135w == null) {
            return new ZaloView();
        }
        return mo36135w;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        if (((ZaloView) obj).m92656bJ() == view) {
            return true;
        }
        return false;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: o */
    public void mo35343o(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f89200u.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f89200u.add((ZaloView.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("z")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    ZaloView m93024O0 = this.f89197r.m93024O0(bundle, str);
                    if (m93024O0 != null) {
                        while (this.f89199t.size() <= parseInt) {
                            this.f89199t.add(null);
                        }
                        this.f89199t.set(parseInt, m93024O0);
                    } else {
                        AbstractC20110a.m104543l(getClass().getSimpleName()).mo104559s("Bad ZaloView at key %s", str);
                    }
                }
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: p */
    public Parcelable mo35344p() {
        Bundle bundle;
        if (this.f89200u.size() > 0) {
            bundle = new Bundle();
            ZaloView.SavedState[] savedStateArr = new ZaloView.SavedState[this.f89200u.size()];
            this.f89200u.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i11 = 0; i11 < this.f89199t.size(); i11++) {
            ZaloView zaloView = (ZaloView) this.f89199t.get(i11);
            if (zaloView != null && zaloView.m92674mJ()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f89197r.m92994D1(bundle, "z" + i11, zaloView);
            }
        }
        return bundle;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: r */
    public void mo35346r(ViewGroup viewGroup, int i11, Object obj) {
        ZaloView zaloView = (ZaloView) obj;
        ZaloView zaloView2 = this.f89198s;
        if (zaloView != zaloView2) {
            if (zaloView2 != null) {
                zaloView2.m92638DK(false);
            }
            zaloView.m92638DK(true);
            this.f89198s = zaloView;
        }
    }

    /* renamed from: w */
    public abstract ZaloView mo36135w(int i11);

    /* renamed from: x */
    public ZaloView m93128x(int i11) {
        if (i11 >= 0 && this.f89199t.size() > i11) {
            return (ZaloView) this.f89199t.get(i11);
        }
        return null;
    }

    /* renamed from: y */
    protected int m93129y() {
        return 0;
    }

    /* renamed from: z */
    protected int mo93130z() {
        return 0;
    }
}
