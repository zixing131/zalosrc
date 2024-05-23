package com.zing.zalo.adapters;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import ck.C3563d;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.utils.phonenumbers.C16741a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import me0.C23278z2;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* renamed from: com.zing.zalo.adapters.v4 */
/* loaded from: classes3.dex */
public class C7238v4 extends BaseAdapter {

    /* renamed from: p */
    private boolean f39757p;

    /* renamed from: q */
    private List f39758q;

    /* renamed from: r */
    private final Context f39759r;

    /* renamed from: s */
    private final C23528a f39760s;

    /* renamed from: com.zing.zalo.adapters.v4$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        RobotoTextView f39761a;

        /* renamed from: b */
        RobotoTextView f39762b;

        /* renamed from: c */
        RecyclingImageView f39763c;

        /* renamed from: d */
        View f39764d;
    }

    public C7238v4(Context context, List list, C23528a c23528a) {
        this.f39758q = new ArrayList();
        this.f39759r = context;
        this.f39760s = c23528a;
        this.f39758q = new ArrayList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m36952c(String str, View view) {
        try {
            if (str.startsWith("http")) {
                AbstractC23647d.m123906p("870040");
                AbstractC23647d.m123893c();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3563d.a getItem(int i11) {
        List list = this.f39758q;
        if (list != null && list.size() > i11 && i11 >= 0) {
            return (C3563d.a) this.f39758q.get(i11);
        }
        return null;
    }

    /* renamed from: d */
    public void m36954d(List list) {
        this.f39758q = new ArrayList(list);
    }

    /* renamed from: e */
    public void m36955e(boolean z11) {
        this.f39757p = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List list = this.f39758q;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int color;
        try {
            if (view == null) {
                aVar = new a();
                view = LayoutInflater.from(this.f39759r).inflate(AbstractC7409c0.layout_oa_item, viewGroup, false);
                aVar.f39761a = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_name);
                aVar.f39762b = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_value);
                aVar.f39763c = (RecyclingImageView) view.findViewById(AbstractC6918a0.icon);
                aVar.f39764d = view.findViewById(AbstractC6918a0.divider_bottom);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            C3563d.a item = getItem(i11);
            if (item != null) {
                aVar.f39761a.setText(item.m18103b());
                if (C16741a.m89329r().m89334E(item.m18104c(), AbstractC23309i.m121704a5())) {
                    String m18104c = item.m18104c();
                    if (!m18104c.equals("invalid") && !TextUtils.isEmpty(m18104c)) {
                        SpannableString spannableString = new SpannableString(m18104c);
                        Linkify.addLinks(spannableString, 4);
                        aVar.f39762b.setText(spannableString);
                        aVar.f39762b.setLinkTextColor(this.f39759r.getResources().getColor(AbstractC16801x.cM1));
                    }
                } else {
                    aVar.f39762b.setText(AbstractC20826v0.m108762H0((InterfaceC27218a) this.f39759r, item.m18104c()));
                }
                aVar.f39762b.setMovementMethod(CustomMovementMethod.m56305e());
                final String m18104c2 = item.m18104c();
                aVar.f39762b.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.u4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7238v4.m36952c(m18104c2, view2);
                    }
                });
                if (!TextUtils.isEmpty(item.m18102a())) {
                    aVar.f39763c.setVisibility(0);
                    ((C23528a) this.f39760s.m123612r(aVar.f39763c)).m123619y(item.m18102a(), C23278z2.m120090Q(), 10);
                } else {
                    aVar.f39763c.setVisibility(8);
                }
                View view2 = aVar.f39764d;
                if (i11 == getCount() - 1) {
                    color = -1;
                } else {
                    color = this.f39759r.getResources().getColor(AbstractC16801x.cLine1);
                }
                view2.setBackgroundColor(color);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return view;
    }
}
