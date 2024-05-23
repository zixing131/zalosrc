package com.zing.zalo.location.widget;

import am.C0943w;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.location.AbstractC8971q;
import com.zing.zalo.location.C8956b;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalocore.CoreUtility;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import nh0.C23793c;
import p262jb.AbstractC21196a;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import vg.C28203u6;

/* loaded from: classes4.dex */
public class LiveLocationBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: H */
    private static final int f48025H = AbstractC16803z.icn_livelocation_anim;

    /* renamed from: I */
    private static final int f48026I = AbstractC16803z.icn_livelocation_white_anim;

    /* renamed from: A */
    int f48027A;

    /* renamed from: B */
    boolean f48028B;

    /* renamed from: C */
    boolean f48029C;

    /* renamed from: D */
    long f48030D;

    /* renamed from: E */
    final Handler f48031E;

    /* renamed from: F */
    final Runnable f48032F;

    /* renamed from: G */
    int f48033G;

    /* renamed from: p */
    final int f48034p;

    /* renamed from: q */
    ImageView f48035q;

    /* renamed from: r */
    RobotoTextView f48036r;

    /* renamed from: s */
    RobotoTextView f48037s;

    /* renamed from: t */
    View f48038t;

    /* renamed from: u */
    Button f48039u;

    /* renamed from: v */
    Button f48040v;

    /* renamed from: w */
    Button f48041w;

    /* renamed from: x */
    View f48042x;

    /* renamed from: y */
    InterfaceC8979b f48043y;

    /* renamed from: z */
    String f48044z;

    /* renamed from: com.zing.zalo.location.widget.LiveLocationBar$a */
    /* loaded from: classes4.dex */
    class RunnableC8978a implements Runnable {
        RunnableC8978a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long mo124310e = (LiveLocationBar.this.f48030D - C23793c.m124316k().mo124310e()) / 1000;
            LiveLocationBar liveLocationBar = LiveLocationBar.this;
            liveLocationBar.f48037s.setText(liveLocationBar.m48004c(mo124310e));
            if (mo124310e > 0) {
                LiveLocationBar.this.m48005d();
            }
        }
    }

    /* renamed from: com.zing.zalo.location.widget.LiveLocationBar$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8979b {
        /* renamed from: a */
        void mo48007a();

        /* renamed from: b */
        void mo48008b();

        /* renamed from: c */
        void mo48009c();
    }

    public LiveLocationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48034p = AbstractC23136l9.m118742r(6.0f);
        this.f48044z = "";
        this.f48027A = 1;
        this.f48028B = false;
        this.f48029C = false;
        this.f48031E = new Handler(Looper.getMainLooper());
        this.f48032F = new RunnableC8978a();
        this.f48033G = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m48002a(List list, String str) {
        boolean z11;
        int i11;
        String string;
        String str2;
        boolean z12;
        boolean isEmpty;
        String str3;
        String str4;
        this.f48031E.removeCallbacksAndMessages(null);
        this.f48044z = str;
        int i12 = 0;
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean m47973e = AbstractC8971q.m47973e(list);
            int i13 = this.f48027A;
            if (i13 == 3 || i13 == 4) {
                if (m47973e) {
                    i11 = f48025H;
                } else {
                    i11 = f48026I;
                }
                setAnimIcon(i11);
            }
            int i14 = this.f48027A;
            if (i14 == 2) {
                if (m47973e) {
                    if (z11) {
                        string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_only_me_v2);
                    } else if (list.size() == 2) {
                        Iterator it = list.iterator();
                        C8969o c8969o = null;
                        while (it.hasNext()) {
                            C8969o c8969o2 = (C8969o) it.next();
                            if (!TextUtils.equals(c8969o2.f47982c, CoreUtility.f89233i)) {
                                c8969o = c8969o2;
                            }
                        }
                        if (c8969o == null) {
                            string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_only_me_v2);
                        } else {
                            ContactProfile m141809c = C28203u6.f131407a.m141809c(c8969o.f47982c);
                            if (m141809c != null) {
                                str4 = m141809c.m40383Q(true, false);
                            } else {
                                str4 = c8969o.f47991l;
                            }
                            if (!TextUtils.isEmpty(str4)) {
                                string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_me_and_another_v2, str4);
                            } else {
                                string = null;
                            }
                        }
                    } else {
                        string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_me_and_others_v2, Integer.valueOf(list.size() - 1));
                    }
                    if (TextUtils.isEmpty(string)) {
                        string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_only_me_v2);
                    }
                } else {
                    C8969o c8969o3 = (C8969o) list.get(0);
                    ContactProfile m141809c2 = C28203u6.f131407a.m141809c(c8969o3.f47982c);
                    if (m141809c2 != null) {
                        str3 = m141809c2.m40383Q(true, false);
                    } else {
                        str3 = c8969o3.f47991l;
                    }
                    if (z11) {
                        string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_one_friend_v2, str3);
                    } else {
                        string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_one_friend_and_others_v2, Integer.valueOf(list.size()));
                    }
                }
                this.f48036r.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            } else if (i14 == 1) {
                if (m47973e) {
                    string = getContext().getString(AbstractC8020f0.str_live_location_bar_sharing_title_2);
                } else {
                    string = getContext().getString(AbstractC8020f0.str_live_location_bar_title_2);
                }
                this.f48036r.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            } else if (m47973e) {
                string = getContext().getString(AbstractC8020f0.str_live_location_bar_stop_sharing_title);
                this.f48036r.setTextColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.light_red));
            } else {
                string = getContext().getString(AbstractC8020f0.str_live_location_bar_title_2);
                this.f48036r.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            }
            int i15 = this.f48027A;
            if (i15 != 2 && i15 != 3 && i15 != 4) {
                if (m47973e) {
                    if (z11) {
                        C8969o c8969o4 = (C8969o) list.get(0);
                        C31973j5 m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132089n(c8969o4.f47981b));
                        if (m4472f != null) {
                            str2 = getContext().getString(AbstractC8020f0.str_live_location_sharing_with_group_name, m4472f.m153793y());
                        } else {
                            str2 = getContext().getString(AbstractC8020f0.str_live_location_sharing_with_name, AbstractC23028c0.m118086f(c8969o4.f47981b, false, AbstractC8020f0.str_me));
                        }
                    } else {
                        str2 = getContext().getString(AbstractC8020f0.str_live_location_multi_sharing, Integer.valueOf(list.size()));
                    }
                    z12 = false;
                    this.f48036r.setText(string);
                    this.f48037s.setText(str2);
                    isEmpty = TextUtils.isEmpty(str2);
                    RobotoTextView robotoTextView = this.f48037s;
                    if (isEmpty) {
                    }
                    robotoTextView.setVisibility(i12);
                    this.f48036r.setMaxLines(2);
                    if (!z12) {
                    }
                    m48003b(true, m47973e);
                    return;
                }
            } else if (z11) {
                C8969o c8969o5 = (C8969o) list.get(0);
                if (m47973e) {
                    String m48004c = m48004c((c8969o5.f47990k - C23793c.m124316k().mo124310e()) / 1000);
                    this.f48030D = c8969o5.f47990k;
                    m48005d();
                    str2 = m48004c;
                    z12 = true;
                    this.f48036r.setText(string);
                    this.f48037s.setText(str2);
                    isEmpty = TextUtils.isEmpty(str2);
                    RobotoTextView robotoTextView2 = this.f48037s;
                    if (isEmpty) {
                        i12 = 8;
                    }
                    robotoTextView2.setVisibility(i12);
                    this.f48036r.setMaxLines(2);
                    if (!z12) {
                        this.f48031E.removeCallbacksAndMessages(null);
                        this.f48030D = 0L;
                    }
                    m48003b(true, m47973e);
                    return;
                }
            }
            str2 = null;
            z12 = false;
            this.f48036r.setText(string);
            this.f48037s.setText(str2);
            isEmpty = TextUtils.isEmpty(str2);
            RobotoTextView robotoTextView22 = this.f48037s;
            if (isEmpty) {
            }
            robotoTextView22.setVisibility(i12);
            this.f48036r.setMaxLines(2);
            if (!z12) {
            }
            m48003b(true, m47973e);
            return;
        }
        this.f48036r.setText(getContext().getString(AbstractC8020f0.str_live_location_bar_title_2));
        this.f48037s.setText(getContext().getString(AbstractC8020f0.str_live_location_bar_subtitle_2));
        this.f48036r.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
        m48003b(false, false);
        int i16 = this.f48027A;
        if (i16 == 3 || i16 == 4) {
            setAnimIcon(f48026I);
        }
    }

    /* renamed from: b */
    void m48003b(boolean z11, boolean z12) {
        this.f48039u.setVisibility(8);
        this.f48040v.setVisibility(8);
        this.f48041w.setVisibility(8);
        this.f48038t.setVisibility(8);
        if (z11) {
            int i11 = this.f48027A;
            if (i11 != 2 && i11 != 1 && z12) {
                if (!TextUtils.isEmpty(this.f48044z) && C8967m.m47867E().m47914R(this.f48044z)) {
                    this.f48033G = -1;
                    setStateShareInProgress(2);
                    return;
                } else {
                    this.f48033G = 2;
                    setStateShareInProgress(0);
                    return;
                }
            }
            this.f48033G = 0;
            setStateShareInProgress(0);
            return;
        }
        if (!TextUtils.isEmpty(this.f48044z) && C8967m.m47867E().m47915S(this.f48044z)) {
            this.f48033G = -1;
            setStateShareInProgress(1);
        } else {
            this.f48033G = 1;
            setStateShareInProgress(0);
        }
    }

    /* renamed from: c */
    String m48004c(long j11) {
        String str;
        long max = Math.max(Math.round(((float) j11) / 60.0f), 0);
        String string = getContext().getString(AbstractC8020f0.str_live_location_time_remain_string);
        Object[] objArr = new Object[2];
        objArr[0] = Long.valueOf(max);
        if (max > 1) {
            str = getContext().getString(AbstractC8020f0.str_more_s);
        } else {
            str = "";
        }
        objArr[1] = str;
        return String.format(string, objArr);
    }

    /* renamed from: d */
    void m48005d() {
        this.f48031E.removeCallbacksAndMessages(null);
        this.f48031E.postDelayed(this.f48032F, 30000L);
    }

    /* renamed from: e */
    public void m48006e(C8956b c8956b, String str) {
        this.f48044z = str;
        if (c8956b != null) {
            this.f48036r.setText(c8956b.m47864a());
            this.f48036r.setMaxLines(2);
            this.f48037s.setVisibility(8);
            m48003b(true, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f48043y != null) {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.live_location_bar) {
                int i11 = this.f48033G;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            this.f48043y.mo48008b();
                            return;
                        }
                        return;
                    }
                    this.f48043y.mo48009c();
                    return;
                }
                this.f48043y.mo48007a();
                return;
            }
            if (id2 == AbstractC6918a0.live_location_bar_btn_view_detail) {
                this.f48043y.mo48007a();
            } else if (id2 == AbstractC6918a0.live_location_bar_btn_start_live) {
                this.f48043y.mo48009c();
            } else if (id2 == AbstractC6918a0.live_location_bar_btn_end_live) {
                this.f48043y.mo48008b();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48031E.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f48035q = (ImageView) findViewById(AbstractC6918a0.live_location_bar_imv_icon);
        this.f48036r = (RobotoTextView) findViewById(AbstractC6918a0.live_location_bar_tv_title);
        this.f48037s = (RobotoTextView) findViewById(AbstractC6918a0.live_location_bar_tv_subtitle);
        this.f48039u = (Button) findViewById(AbstractC6918a0.live_location_bar_btn_start_live);
        this.f48040v = (Button) findViewById(AbstractC6918a0.live_location_bar_btn_end_live);
        this.f48041w = (Button) findViewById(AbstractC6918a0.live_location_bar_btn_view_detail);
        this.f48042x = findViewById(AbstractC6918a0.live_location_bar_progress_bar);
        this.f48038t = findViewById(AbstractC6918a0.live_location_bar_button_group);
        setOnClickListener(this);
        this.f48039u.setOnClickListener(this);
        this.f48040v.setOnClickListener(this);
        this.f48041w.setOnClickListener(this);
    }

    void setAnimIcon(int i11) {
        try {
            if (this.f48035q.getDrawable() != null && (this.f48035q.getDrawable() instanceof AnimationDrawable)) {
                ((AnimationDrawable) this.f48035q.getDrawable()).stop();
            }
            this.f48035q.setImageResource(i11);
            ((AnimationDrawable) this.f48035q.getDrawable()).start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setHandleClickListener(boolean z11) {
        if (z11) {
            setOnClickListener(this);
        }
    }

    public void setListener(InterfaceC8979b interfaceC8979b) {
        this.f48043y = interfaceC8979b;
    }

    public void setMode(int i11) {
        boolean z11;
        this.f48027A = i11;
        if (i11 != 2 && i11 != 3 && i11 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f48028B = z11;
        if (i11 == 3 || i11 == 4) {
            this.f48036r.setTextSize(1, 16.0f);
            this.f48037s.setTextSize(1, 14.0f);
        }
        if (i11 != 1 && i11 != 2 && i11 != 4) {
            setAnimIcon(f48026I);
        } else {
            setAnimIcon(f48025H);
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(4.0f));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f48035q.getLayoutParams();
                layoutParams.width = AbstractC23136l9.m118742r(48.0f);
                layoutParams.height = AbstractC23136l9.m118742r(48.0f);
                this.f48035q.setLayoutParams(layoutParams);
                this.f48035q.setPadding(0, 0, 0, 0);
                return;
            }
            setPadding(AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(4.0f));
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f48035q.getLayoutParams();
            layoutParams2.width = AbstractC23136l9.m118742r(33.0f);
            layoutParams2.height = AbstractC23136l9.m118742r(33.0f);
            this.f48035q.setLayoutParams(layoutParams2);
            this.f48035q.setPadding(0, 0, 0, 0);
            return;
        }
        setPadding(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(5.0f));
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f48035q.getLayoutParams();
        layoutParams3.width = AbstractC23136l9.m118742r(48.0f);
        layoutParams3.height = AbstractC23136l9.m118742r(48.0f);
        this.f48035q.setLayoutParams(layoutParams3);
        this.f48035q.setPadding(AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f));
    }

    void setStateShareInProgress(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                this.f48037s.setText(AbstractC8020f0.str_live_location_stop_share_in_progress);
                return;
            }
            return;
        }
        this.f48037s.setText(AbstractC8020f0.str_live_location_share_in_progress);
    }
}
