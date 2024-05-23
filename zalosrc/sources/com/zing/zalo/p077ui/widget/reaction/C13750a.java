package com.zing.zalo.p077ui.widget.reaction;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.EmojiView;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import com.zing.zalo.p077ui.widget.RobotoTextViewStateAware;
import com.zing.zalo.p077ui.widget.reaction.C13750a;
import com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import ph.C24751d;
import ph.C24753f;

/* renamed from: com.zing.zalo.ui.widget.reaction.a */
/* loaded from: classes6.dex */
public class C13750a extends AbstractC6881a implements PagerSlidingTabStrip.InterfaceC13514b {

    /* renamed from: r */
    Context f71191r;

    /* renamed from: s */
    C24751d f71192s;

    /* renamed from: t */
    ZDSReactionDetailItemView.InterfaceC13749a f71193t;

    /* renamed from: u */
    int f71194u;

    /* renamed from: v */
    ArrayList f71195v = new ArrayList();

    public C13750a(Context context, C24751d c24751d, ZDSReactionDetailItemView.InterfaceC13749a interfaceC13749a) {
        this.f71191r = context;
        this.f71193t = interfaceC13749a;
        this.f71192s = c24751d;
        this.f71194u = c24751d.m128571o();
        this.f71195v.addAll(c24751d.m128566i(true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static /* synthetic */ void m76828x(RecyclerView recyclerView) {
        try {
            if (recyclerView.getAdapter() != null) {
                recyclerView.getAdapter().m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.PagerSlidingTabStrip.InterfaceC13514b
    /* renamed from: b */
    public View mo36134b(int i11) {
        C24753f c24753f;
        int i12;
        String str;
        if (i11 == 0) {
            RobotoTextViewStateAware robotoTextViewStateAware = new RobotoTextViewStateAware(this.f71191r);
            robotoTextViewStateAware.setGravity(16);
            robotoTextViewStateAware.setText(String.format(this.f71191r.getString(AbstractC8020f0.str_reaction_all), Integer.valueOf(this.f71192s.m128572p())));
            robotoTextViewStateAware.setTextSize(1, 14.0f);
            robotoTextViewStateAware.setTextColor(AbstractC23136l9.m118645D(this.f71191r, AbstractC16801x.pager_tab_title_selector_gray));
            return robotoTextViewStateAware;
        }
        if (this.f71195v.size() >= i11) {
            c24753f = (C24753f) this.f71195v.get(i11 - 1);
            i12 = this.f71192s.m128573q(c24753f.m128597j());
        } else {
            c24753f = null;
            i12 = 0;
        }
        LinearLayout linearLayout = new LinearLayout(this.f71191r);
        linearLayout.setOrientation(0);
        EmojiView emojiView = new EmojiView(this.f71191r);
        if (c24753f != null) {
            str = c24753f.m128596i();
        } else {
            str = "";
        }
        emojiView.setEmojiSize(AbstractC23136l9.m118742r(12.0f));
        emojiView.setData(str);
        emojiView.setDuplicateParentStateEnabled(true);
        linearLayout.addView(emojiView, new ViewGroup.LayoutParams(AbstractC23136l9.m118742r(25.0f), -1));
        RobotoTextViewStateAware robotoTextViewStateAware2 = new RobotoTextViewStateAware(this.f71191r);
        robotoTextViewStateAware2.setGravity(16);
        robotoTextViewStateAware2.setTextSize(1, 14.0f);
        robotoTextViewStateAware2.setTextColor(AbstractC23136l9.m118645D(this.f71191r, AbstractC16801x.pager_tab_title_selector_gray));
        robotoTextViewStateAware2.setDuplicateParentStateEnabled(true);
        robotoTextViewStateAware2.setText(String.valueOf(i12));
        linearLayout.addView(robotoTextViewStateAware2, new ViewGroup.LayoutParams(-2, -1));
        return linearLayout;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f71195v.size() + 1;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        final RecyclerView recyclerView = new RecyclerView(this.f71191r);
        try {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f71191r, 1, false));
            recyclerView.setAdapter(new C13762c(this.f71191r, this.f71192s, i11, this.f71193t));
            viewGroup.addView(recyclerView);
            if (i11 == 0) {
                HashSet hashSet = new HashSet();
                Iterator it = this.f71192s.m128562c().iterator();
                while (it.hasNext()) {
                    hashSet.add(String.valueOf((Integer) it.next()));
                }
                AbstractC23184q2.m119463u(new ArrayList(hashSet), new Runnable() { // from class: lb0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13750a.m76828x(RecyclerView.this);
                    }
                });
            }
            return recyclerView;
        } catch (Exception e11) {
            e11.printStackTrace();
            return recyclerView;
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }
}
