package com.zing.zalo.adapters;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import au.C2343e;
import com.androidquery.util.RecyclingImageView;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ContentMessagePopup;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p588vw.C28652r;
import v50.C27870vb;

/* renamed from: com.zing.zalo.adapters.f5 */
/* loaded from: classes3.dex */
public class C7063f5 extends AbstractC6881a {

    /* renamed from: r */
    ArrayList f38600r;

    /* renamed from: s */
    public Activity f38601s;

    /* renamed from: t */
    public LayoutInflater f38602t;

    /* renamed from: u */
    C23528a f38603u;

    /* renamed from: com.zing.zalo.adapters.f5$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public RecyclingImageView f38604a;

        /* renamed from: b */
        public ImageView f38605b;

        /* renamed from: c */
        public TextView f38606c;

        /* renamed from: d */
        public TextView f38607d;

        /* renamed from: e */
        public TextView f38608e;

        /* renamed from: f */
        public RelativeLayout f38609f;
    }

    public C7063f5(Activity activity, ArrayList arrayList, C23528a c23528a) {
        this.f38601s = activity;
        this.f38603u = c23528a;
        this.f38600r = new ArrayList(arrayList);
        this.f38602t = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    /* renamed from: x */
    public /* synthetic */ void m36065x(ContentMessagePopup contentMessagePopup, View view) {
        AbstractC23647d.m123907q("16500", "");
        ContactProfile contactProfile = new ContactProfile(contentMessagePopup.f42518p);
        contactProfile.f42437s = contentMessagePopup.f42519q;
        contactProfile.f42446v = contentMessagePopup.f42522t;
        contactProfile.m40421o1(contentMessagePopup.f42521s);
        contactProfile.m40401d1(contentMessagePopup.f42520r);
        if (TextUtils.isEmpty(contentMessagePopup.f42518p)) {
            MessagePopupActivity.m56884o5(false);
            AbstractC23304d.f113350Y0 = System.currentTimeMillis();
            this.f38601s.finish();
        } else {
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            MessagePopupActivity.m56884o5(false);
            AbstractC23304d.f113350Y0 = System.currentTimeMillis();
            this.f38601s.startActivity(AbstractC23152n3.m119002J(m140776b));
            this.f38601s.finish();
            AbstractC23647d.m123893c();
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        ArrayList arrayList = this.f38600r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: k */
    public Object mo35339k(ViewGroup viewGroup, int i11) {
        int i12;
        View view = null;
        try {
            a aVar = new a();
            view = this.f38602t.inflate(AbstractC7409c0.popupmsg_item, (ViewGroup) null);
            aVar.f38609f = (RelativeLayout) view.findViewById(AbstractC6918a0.layoutPopupMsg);
            aVar.f38604a = (RecyclingImageView) view.findViewById(AbstractC6918a0.buddy_dp);
            aVar.f38605b = (ImageView) view.findViewById(AbstractC6918a0.file_preview_icon);
            aVar.f38608e = (TextView) view.findViewById(AbstractC6918a0.tvTime);
            Typeface defaultFromStyle = Typeface.defaultFromStyle(0);
            TextView textView = (TextView) view.findViewById(AbstractC6918a0.contentMessage);
            aVar.f38606c = textView;
            textView.setTypeface(defaultFromStyle);
            TextView textView2 = aVar.f38606c;
            if (AbstractC23136l9.m118660K0(this.f38601s)) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            textView2.setMaxLines(i12);
            aVar.f38607d = (TextView) view.findViewById(AbstractC6918a0.name);
            view.setTag(aVar);
            aVar.f38604a.setImageResource(AbstractC16803z.avatar_grpinvite);
            ContentMessagePopup contentMessagePopup = (ContentMessagePopup) this.f38600r.get(i11);
            if (contentMessagePopup != null) {
                String m114542i = AbstractC21935u.m114542i(contentMessagePopup.f42518p, contentMessagePopup.f42519q);
                if (!TextUtils.isEmpty(contentMessagePopup.f42522t)) {
                    if (C23302b.f113247a.m120523d(contentMessagePopup.f42522t) && !CoreUtility.f89233i.equals(contentMessagePopup.f42518p)) {
                        aVar.f38604a.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(m114542i), C2343e.m12307a(contentMessagePopup.f42518p, false)));
                    } else {
                        ((C23528a) this.f38603u.m123612r(aVar.f38604a)).m123618x(contentMessagePopup.f42522t, C23278z2.m120143n());
                    }
                }
                aVar.f38606c.setVisibility(8);
                if (contentMessagePopup.f42520r.length() > 0) {
                    CharSequence m143357H = C28652r.m143349v().m143357H(contentMessagePopup.f42520r);
                    if (contentMessagePopup.f42525w) {
                        m143357H = this.f38601s.getString(AbstractC8020f0.noti_ref_text) + " " + ((Object) m143357H);
                    }
                    aVar.f38606c.setText(m143357H);
                }
                aVar.f38607d.setText(m114542i);
                aVar.f38608e.setText(AbstractC23160o0.m119192F0(contentMessagePopup.f42523u));
                int i13 = contentMessagePopup.f42521s;
                if (i13 != 2) {
                    if (i13 != 3 && i13 != 4) {
                        if (i13 != 6) {
                            if (i13 != 10) {
                                if (i13 != 15) {
                                    if (i13 != 25) {
                                        if (i13 != 31) {
                                            if (i13 != 34) {
                                                if (i13 != 36) {
                                                    if (i13 != 18) {
                                                        if (i13 != 19) {
                                                            switch (i13) {
                                                                case 21:
                                                                    aVar.f38606c.setText(AbstractC8020f0.str_type_msg_ecard);
                                                                    aVar.f38606c.setVisibility(0);
                                                                    aVar.f38605b.setVisibility(8);
                                                                    break;
                                                                case 22:
                                                                    aVar.f38605b.setImageResource(AbstractC16803z.icofile_attach);
                                                                    aVar.f38605b.setVisibility(0);
                                                                    aVar.f38606c.setVisibility(8);
                                                                    break;
                                                                case 23:
                                                                    aVar.f38606c.setText(AbstractC8020f0.str_type_msg_gif);
                                                                    aVar.f38606c.setVisibility(0);
                                                                    aVar.f38605b.setVisibility(8);
                                                                    break;
                                                                default:
                                                                    aVar.f38605b.setVisibility(8);
                                                                    aVar.f38606c.setVisibility(0);
                                                                    break;
                                                            }
                                                        } else {
                                                            m36066y(aVar.f38605b, AbstractC16803z.ic_msg_video);
                                                            aVar.f38606c.setVisibility(8);
                                                        }
                                                    } else {
                                                        m36066y(aVar.f38605b, AbstractC16803z.ic_msg_location);
                                                        aVar.f38606c.setVisibility(8);
                                                    }
                                                } else {
                                                    aVar.f38606c.setText(AbstractC8020f0.str_bubble_undo_sent_message);
                                                    aVar.f38606c.setVisibility(0);
                                                    aVar.f38605b.setVisibility(8);
                                                }
                                            } else {
                                                aVar.f38606c.setText(AbstractC8020f0.str_type_msg_feed_no_caption);
                                                aVar.f38606c.setVisibility(0);
                                                aVar.f38605b.setVisibility(8);
                                            }
                                        }
                                    } else {
                                        m36066y(aVar.f38605b, AbstractC16803z.icon_livestream_quickreply);
                                        aVar.f38606c.setText("");
                                    }
                                } else {
                                    m36066y(aVar.f38605b, AbstractC16803z.ic_msg_richmsg);
                                    aVar.f38606c.setVisibility(8);
                                }
                            } else {
                                m36066y(aVar.f38605b, AbstractC16803z.ic_msg_sticker);
                                aVar.f38606c.setText("");
                            }
                        } else {
                            m36066y(aVar.f38605b, AbstractC16803z.ic_msg_sound);
                            aVar.f38606c.setVisibility(8);
                        }
                    }
                    m36066y(aVar.f38605b, AbstractC16803z.ic_msg_img);
                    aVar.f38606c.setVisibility(8);
                } else {
                    m36066y(aVar.f38605b, AbstractC16803z.ic_msg_draw);
                    aVar.f38606c.setVisibility(8);
                }
                aVar.f38609f.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.e5

                    /* renamed from: q */
                    public final /* synthetic */ ContentMessagePopup f38543q;

                    public /* synthetic */ ViewOnClickListenerC7052e5(ContentMessagePopup contentMessagePopup2) {
                        r2 = contentMessagePopup2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7063f5.this.m36065x(r2, view2);
                    }
                });
                viewGroup.addView(view, -1, -1);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("", e11);
        }
        return view;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: y */
    void m36066y(ImageView imageView, int i11) {
        imageView.setVisibility(0);
        imageView.setImageResource(i11);
    }

    /* renamed from: z */
    public void m36067z(ArrayList arrayList) {
        this.f38600r = new ArrayList(arrayList);
    }
}
