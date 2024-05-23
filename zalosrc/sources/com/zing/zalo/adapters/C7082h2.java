package com.zing.zalo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.GroupPollOptionsDetailRecyclerAdapter;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23184q2;
import p588vw.C28652r;
import p716zh.C31961i8;

/* renamed from: com.zing.zalo.adapters.h2 */
/* loaded from: classes3.dex */
public class C7082h2 extends AbstractC6881a implements PagerSlidingTabStrip.InterfaceC13514b {

    /* renamed from: r */
    Context f38720r;

    /* renamed from: s */
    GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a f38721s;

    /* renamed from: t */
    ArrayList f38722t;

    /* renamed from: u */
    public HashMap f38723u = new HashMap();

    /* renamed from: v */
    LayoutInflater f38724v;

    public C7082h2(Context context, ArrayList arrayList, GroupPollOptionsDetailRecyclerAdapter.InterfaceC6959a interfaceC6959a) {
        this.f38720r = context;
        this.f38721s = interfaceC6959a;
        this.f38722t = arrayList;
        this.f38724v = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // com.zing.zalo.p077ui.widget.PagerSlidingTabStrip.InterfaceC13514b
    /* renamed from: b */
    public View mo36134b(int i11) {
        C31961i8.a m36136w = m36136w(i11);
        if (m36136w == null) {
            return null;
        }
        String str = m36136w.f146901a;
        if (str.length() > 20) {
            str = str.substring(0, 17) + "...";
        }
        View inflate = this.f38724v.inflate(AbstractC7409c0.group_poll_options_detail_header, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_option);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.tv_no_votes);
        textView.setText(C28652r.m143349v().m143357H(str));
        textView2.setText(String.valueOf(m36136w.f146902b));
        return inflate;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        this.f38723u.remove(Integer.valueOf(i11));
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f38722t.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        try {
            View m119457o = AbstractC23184q2.m119457o(this.f38720r, m36136w(i11), this.f38721s);
            viewGroup.addView(m119457o);
            this.f38723u.put(Integer.valueOf(i11), m119457o);
            return m119457o;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: w */
    public C31961i8.a m36136w(int i11) {
        if (i11 < this.f38722t.size()) {
            return (C31961i8.a) this.f38722t.get(i11);
        }
        return null;
    }
}
