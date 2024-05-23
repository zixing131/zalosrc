package com.zing.zalo.p077ui.chat.widget.searchinline;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;
import p611wj.C29053a;
import p716zh.C31902e9;

/* loaded from: classes5.dex */
public class SearchRowAction extends RelativeLayout implements View.OnClickListener {

    /* renamed from: p */
    private C31902e9 f61376p;

    /* renamed from: q */
    private InterfaceC11801a f61377q;

    /* renamed from: r */
    private RecyclingImageView f61378r;

    /* renamed from: s */
    private TextView f61379s;

    /* renamed from: t */
    private C23528a f61380t;

    /* renamed from: u */
    private final C3977j f61381u;

    /* renamed from: v */
    SearchRowAction f61382v;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowAction$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11801a {
        /* renamed from: a */
        void mo65621a(View view, C31902e9 c31902e9);
    }

    public SearchRowAction(Context context) {
        super(context);
        this.f61381u = new C3977j(MainApplication.getAppContext());
        this.f61382v = this;
        m65620a();
    }

    /* renamed from: a */
    private void m65620a() {
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.action_item_layout, (ViewGroup) this, true);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f61382v.findViewById(AbstractC6918a0.icon);
        this.f61378r = recyclingImageView;
        recyclingImageView.setImageDrawable(C23212s8.m119609q(getContext(), AbstractC16781w.default_avatar));
        this.f61379s = (TextView) this.f61382v.findViewById(AbstractC6918a0.title);
        this.f61380t = new C23528a(getContext());
        AbstractC23136l9.m118693a1(this.f61382v, AbstractC16803z.stencils_contact_bg);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC11801a interfaceC11801a = this.f61377q;
        if (interfaceC11801a != null) {
            interfaceC11801a.mo65621a(view, this.f61376p);
        }
    }

    public void setListener(InterfaceC11801a interfaceC11801a) {
        this.f61377q = interfaceC11801a;
    }

    public void setSearchResult(C31902e9 c31902e9) {
        this.f61376p = c31902e9;
        if (c31902e9 != null) {
            C29053a m153309a = c31902e9.m153309a();
            C24003n m120079K0 = C23278z2.m120079K0();
            if (C23999j.m125696L2(m153309a.m145098c(), m120079K0)) {
                C3979l m123606l = this.f61380t.m123606l(m153309a.m145098c(), m120079K0.f116260a, m120079K0.f116263d, m120079K0.f116266g);
                if (m123606l != null) {
                    C3977j c3977j = this.f61381u;
                    if (c3977j != null) {
                        c3977j.setImageInfo(m123606l, false);
                    }
                    this.f61378r.setImageBitmap(m123606l.m18839c());
                    invalidate();
                }
            } else {
                ((C23528a) this.f61380t.m123612r(this.f61378r)).m123618x(m153309a.m145098c(), C23278z2.m120120d0());
            }
            this.f61379s.setText(m153309a.m145099d());
        }
        setOnClickListener(this);
    }
}
