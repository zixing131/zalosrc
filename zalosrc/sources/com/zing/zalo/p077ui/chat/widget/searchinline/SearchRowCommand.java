package com.zing.zalo.p077ui.chat.widget.searchinline;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.C2343e;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31870c7;
import p716zh.C31887d9;
import p716zh.C31902e9;

/* loaded from: classes5.dex */
public class SearchRowCommand extends RelativeLayout implements View.OnClickListener {

    /* renamed from: p */
    private C31902e9 f61396p;

    /* renamed from: q */
    private InterfaceC11804a f61397q;

    /* renamed from: r */
    private RecyclingImageView f61398r;

    /* renamed from: s */
    private TextView f61399s;

    /* renamed from: t */
    private TextView f61400t;

    /* renamed from: u */
    private C23528a f61401u;

    /* renamed from: v */
    private int f61402v;

    /* renamed from: com.zing.zalo.ui.chat.widget.searchinline.SearchRowCommand$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11804a {
        /* renamed from: a */
        void mo65626a(View view, C31902e9 c31902e9, int i11);
    }

    public SearchRowCommand(Context context) {
        super(context);
        m65624a();
    }

    /* renamed from: a */
    private void m65624a() {
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.command_item_layout, (ViewGroup) this, true);
        this.f61398r = (RecyclingImageView) findViewById(AbstractC6918a0.img_icon);
        this.f61399s = (TextView) findViewById(AbstractC6918a0.tv_content);
        this.f61400t = (TextView) findViewById(AbstractC6918a0.tv_content_username);
        this.f61401u = new C23528a(getContext());
        AbstractC23136l9.m118693a1(this, AbstractC16803z.stencils_contact_bg);
    }

    /* renamed from: b */
    public void m65625b(C31902e9 c31902e9, int i11) {
        this.f61402v = i11;
        this.f61396p = c31902e9;
        this.f61400t.setVisibility(8);
        this.f61400t.setBackground(null);
        if (c31902e9 != null) {
            int m153322n = c31902e9.m153322n();
            if (m153322n != -100) {
                if (m153322n == 6) {
                    this.f61400t.setTextSize(16.0f);
                    C31870c7 m153315g = c31902e9.m153315g();
                    String str = m153315g.f146371g;
                    if (m153315g.f146365a == 1) {
                        this.f61398r.setImageResource(AbstractC16803z.icn_csc_toolbar_mention_all);
                    } else {
                        ((C23528a) this.f61401u.m123612r(this.f61398r)).m123613s(AbstractC16803z.default_avatar);
                    }
                    String str2 = "";
                    if (AbstractC0924m0.m3863h7() == 1) {
                        if (!TextUtils.isEmpty(m153315g.f146372h)) {
                            if (!TextUtils.isEmpty(str) && str.length() > 20) {
                                str2 = str.substring(0, 20).concat("...");
                            }
                            this.f61400t.setText(m153315g.f146372h);
                            this.f61400t.setVisibility(0);
                            if (m153315g.f146365a == 0) {
                                this.f61400t.setTextSize(13.0f);
                                TextView textView = this.f61400t;
                                textView.setBackground(AbstractC23136l9.m118665N(textView.getContext(), AbstractC16803z.rounded_bubble_bg_cpage));
                            }
                        } else {
                            this.f61400t.setVisibility(8);
                        }
                    }
                    TextView textView2 = this.f61399s;
                    if (TextUtils.isEmpty(str2)) {
                        str2 = str;
                    }
                    textView2.setText(str2);
                    if (!TextUtils.isEmpty(m153315g.f146367c)) {
                        if (C23302b.f113247a.m120523d(m153315g.f146367c) && !CoreUtility.f89233i.equals(m153315g.f146366b)) {
                            int m12307a = C2343e.m12307a(m153315g.f146366b, false);
                            this.f61398r.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(str), m12307a));
                        } else {
                            ((C23528a) this.f61401u.m123612r(this.f61398r)).m123618x(m153315g.f146367c, C23278z2.m120143n());
                        }
                    }
                }
            } else {
                C31887d9 m153319k = c31902e9.m153319k();
                this.f61399s.setText(m153319k.m153215e());
                ((C23528a) this.f61401u.m123612r(this.f61398r)).m123618x(m153319k.m153223m(), C23278z2.m120079K0());
                this.f61400t.setVisibility(0);
                this.f61400t.setTextSize(16.0f);
                this.f61400t.setText(m153319k.m153213c());
            }
        }
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC11804a interfaceC11804a = this.f61397q;
        if (interfaceC11804a != null) {
            interfaceC11804a.mo65626a(view, this.f61396p, this.f61402v);
        }
    }

    public void setListener(InterfaceC11804a interfaceC11804a) {
        this.f61397q = interfaceC11804a;
    }
}
