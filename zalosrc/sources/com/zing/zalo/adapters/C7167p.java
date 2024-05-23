package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p716zh.C31901e8;

/* renamed from: com.zing.zalo.adapters.p */
/* loaded from: classes3.dex */
public class C7167p extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f39241r = new ArrayList();

    /* renamed from: s */
    Map f39242s;

    /* renamed from: t */
    Typeface f39243t;

    /* renamed from: com.zing.zalo.adapters.p$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public RobotoTextView f39244I;

        /* renamed from: J */
        public RobotoTextView f39245J;

        /* renamed from: K */
        public RobotoTextView f39246K;

        /* renamed from: L */
        public CheckBox f39247L;

        public a(View view) {
            super(view);
            this.f39244I = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
            this.f39245J = (RobotoTextView) view.findViewById(AbstractC6918a0.number);
            this.f39246K = (RobotoTextView) view.findViewById(AbstractC6918a0.numberConvert);
            this.f39247L = (CheckBox) view.findViewById(AbstractC6918a0.checkbox);
        }
    }

    public C7167p(Context context, Map map) {
        this.f39242s = map;
        this.f39243t = C13718q1.m76694c(context, 7);
    }

    /* renamed from: L */
    public C31901e8 m36454L(int i11) {
        List list = this.f39241r;
        if (list != null && i11 < list.size()) {
            return (C31901e8) this.f39241r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(a aVar, int i11) {
        try {
            C31901e8 m36454L = m36454L(i11);
            aVar.f39244I.setText(m36454L.m153295h());
            aVar.f39247L.setChecked(this.f39242s.containsKey(Long.valueOf(m36454L.m153294g())));
            SpannableString spannableString = new SpannableString(m36454L.f146561w);
            SpannableString spannableString2 = new SpannableString(m36454L.f146560v);
            if (m36454L.f146562x > 0 && m36454L.f146563y > 0) {
                try {
                    spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(aVar.f7784p.getContext(), AbstractC21196a.TextColor1)), 0, m36454L.f146562x, 33);
                    spannableString.setSpan(new StyleSpan(1), 0, m36454L.f146562x, 33);
                    spannableString2.setSpan(new ForegroundColorSpan(C23212s8.m119607o(aVar.f7784p.getContext(), AbstractC21196a.TextColor1)), 0, m36454L.f146563y, 33);
                    spannableString2.setSpan(new StyleSpan(1), 0, m36454L.f146563y, 33);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            aVar.f39245J.setText(spannableString);
            aVar.f39246K.setText(spannableString2);
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_convert_phone_number, viewGroup, false));
    }

    /* renamed from: O */
    public void m36457O(List list) {
        if (list != null) {
            this.f39241r = new ArrayList(list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f39241r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
