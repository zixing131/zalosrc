package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import au.C2343e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.StorySeenUsersLayout;
import com.zing.zalo.uicontrol.C16640q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p716zh.C31844ab;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class StorySeenUsersLayout extends FrameLayout implements AbstractRunnableC28185s6.b {

    /* renamed from: x */
    public static int f69831x;

    /* renamed from: y */
    public static int f69832y;

    /* renamed from: z */
    public static int f69833z;

    /* renamed from: p */
    C23528a f69834p;

    /* renamed from: q */
    int f69835q;

    /* renamed from: r */
    int f69836r;

    /* renamed from: s */
    List f69837s;

    /* renamed from: t */
    List f69838t;

    /* renamed from: u */
    RobotoTextView f69839u;

    /* renamed from: v */
    String f69840v;

    /* renamed from: w */
    boolean f69841w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.StorySeenUsersLayout$a */
    /* loaded from: classes6.dex */
    public class C13547a extends AbstractRunnableC28185s6 {
        C13547a(AbstractRunnableC28185s6.b bVar, List list, int i11) {
            super(bVar, list, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m75969h(ContactProfile contactProfile, AvatarImageView avatarImageView) {
            StorySeenUsersLayout.this.m75966e(contactProfile, avatarImageView);
        }

        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        public void mo61137c(ArrayList arrayList) {
            final AvatarImageView m75964c;
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    final ContactProfile contactProfile = (ContactProfile) it.next();
                    if (contactProfile != null && (m75964c = StorySeenUsersLayout.this.m75964c(contactProfile.f42434r)) != null) {
                        m75964c.post(new Runnable() { // from class: com.zing.zalo.ui.widget.a3
                            @Override // java.lang.Runnable
                            public final void run() {
                                StorySeenUsersLayout.C13547a.this.m75969h(contactProfile, m75964c);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public StorySeenUsersLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75965d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public AvatarImageView m75964c(String str) {
        List<AvatarImageView> list = this.f69838t;
        if (list != null) {
            for (AvatarImageView avatarImageView : list) {
                if (avatarImageView != null && avatarImageView.getTag() != null && avatarImageView.getTag().equals(str)) {
                    return avatarImageView;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    private void m75965d() {
        f69831x = AbstractC23136l9.m118742r(24.0f);
        f69832y = AbstractC23136l9.m118742r(24.0f);
        f69833z = AbstractC23136l9.m118742r(1.0f);
        this.f69834p = new C23528a(getContext());
        this.f69838t = new ArrayList();
        RobotoTextView robotoTextView = new RobotoTextView(getContext());
        this.f69839u = robotoTextView;
        robotoTextView.setGravity(17);
        this.f69839u.setTextSize(1, 11.0f);
        this.f69839u.setTextColor(-1);
        this.f69839u.setBackgroundResource(AbstractC16803z.bg_story_seen_has_new);
        this.f69835q = f69831x;
        this.f69836r = f69832y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m75966e(ContactProfile contactProfile, AvatarImageView avatarImageView) {
        if (avatarImageView != null && contactProfile != null) {
            int m12307a = C2343e.m12307a(contactProfile.f42434r, false);
            avatarImageView.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false)), m12307a));
        }
    }

    /* renamed from: f */
    private void m75967f() {
        removeAllViews();
        this.f69838t.clear();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f69837s.size(); i11++) {
            AvatarImageView avatarImageView = new AvatarImageView(getContext());
            avatarImageView.setBackgroundResource(AbstractC16803z.bg_story_seen_avatar);
            C31844ab c31844ab = (C31844ab) this.f69837s.get(i11);
            if (c31844ab != null && !TextUtils.isEmpty(c31844ab.f146162a) && !TextUtils.isEmpty(c31844ab.f146163b)) {
                avatarImageView.setTag(c31844ab.f146162a);
                if (AbstractC21935u.m114557x(c31844ab.f146162a, c31844ab.f146163b)) {
                    ContactProfile m141811g = C28203u6.f131407a.m141811g(c31844ab.f146162a);
                    if (m141811g != null) {
                        m75966e(m141811g, avatarImageView);
                    } else {
                        arrayList.add(c31844ab.f146162a);
                    }
                } else {
                    ((C23528a) this.f69834p.m123612r(avatarImageView)).m123618x(((C31844ab) this.f69837s.get(i11)).f146163b, C23278z2.m120141m0());
                }
                this.f69838t.add(avatarImageView);
            }
        }
        if (arrayList.size() > 0) {
            new C13547a(this, arrayList, 1055).m141750b();
        }
        for (int i12 = 0; i12 < this.f69838t.size(); i12++) {
            if (((AvatarImageView) this.f69838t.get(i12)).getParent() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f69835q, this.f69836r, 83);
                layoutParams.setMargins(((int) (this.f69835q * 0.8f)) * i12, 0, 0, 0);
                addView((View) this.f69838t.get(i12), layoutParams);
            }
        }
        if (!TextUtils.isEmpty(this.f69840v)) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f69835q, this.f69836r, 83);
            layoutParams2.setMargins(((int) (this.f69835q * 0.8f)) * this.f69838t.size(), 0, 0, 0);
            if (this.f69841w) {
                this.f69839u.setBackgroundResource(AbstractC16803z.bg_story_seen_has_new);
            } else {
                this.f69839u.setBackgroundResource(AbstractC16803z.bg_story_seen_normal);
            }
            this.f69839u.setText(String.format("%s", this.f69840v));
            addView(this.f69839u, layoutParams2);
        }
    }

    public List<C31844ab> getAvatarList() {
        return this.f69837s;
    }

    public void setAvatarSize(int i11) {
        this.f69836r = i11;
        this.f69835q = i11;
        m75967f();
    }
}
