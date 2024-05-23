package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC1078k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes2.dex */
public class C1071d extends BaseAdapter {

    /* renamed from: p */
    C1072e f4007p;

    /* renamed from: q */
    private int f4008q = -1;

    /* renamed from: r */
    private boolean f4009r;

    /* renamed from: s */
    private final boolean f4010s;

    /* renamed from: t */
    private final LayoutInflater f4011t;

    /* renamed from: u */
    private final int f4012u;

    public C1071d(C1072e c1072e, LayoutInflater layoutInflater, boolean z11, int i11) {
        this.f4010s = z11;
        this.f4011t = layoutInflater;
        this.f4007p = c1072e;
        this.f4012u = i11;
        m5035a();
    }

    /* renamed from: a */
    void m5035a() {
        C1074g m5096x = this.f4007p.m5096x();
        if (m5096x != null) {
            ArrayList m5050B = this.f4007p.m5050B();
            int size = m5050B.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((C1074g) m5050B.get(i11)) == m5096x) {
                    this.f4008q = i11;
                    return;
                }
            }
        }
        this.f4008q = -1;
    }

    /* renamed from: b */
    public C1072e m5036b() {
        return this.f4007p;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1074g getItem(int i11) {
        ArrayList m5054G;
        if (this.f4010s) {
            m5054G = this.f4007p.m5050B();
        } else {
            m5054G = this.f4007p.m5054G();
        }
        int i12 = this.f4008q;
        if (i12 >= 0 && i11 >= i12) {
            i11++;
        }
        return (C1074g) m5054G.get(i11);
    }

    /* renamed from: d */
    public void m5038d(boolean z11) {
        this.f4009r = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList m5054G;
        if (this.f4010s) {
            m5054G = this.f4007p.m5050B();
        } else {
            m5054G = this.f4007p.m5054G();
        }
        if (this.f4008q < 0) {
            return m5054G.size();
        }
        return m5054G.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        int i12;
        boolean z11;
        if (view == null) {
            view = this.f4011t.inflate(this.f4012u, viewGroup, false);
        }
        int groupId = getItem(i11).getGroupId();
        int i13 = i11 - 1;
        if (i13 >= 0) {
            i12 = getItem(i13).getGroupId();
        } else {
            i12 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4007p.mo5055H() && groupId != i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        listMenuItemView.setGroupDividerEnabled(z11);
        InterfaceC1078k.a aVar = (InterfaceC1078k.a) view;
        if (this.f4009r) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo4971b(getItem(i11), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m5035a();
        super.notifyDataSetChanged();
    }
}
