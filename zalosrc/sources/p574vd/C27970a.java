package p574vd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import au.C2343e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16640q2;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23028c0;
import p348mi.C23302b;
import p354n3.C23528a;
import p649xl.C30120xa;

/* renamed from: vd.a */
/* loaded from: classes3.dex */
public final class C27970a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ViewGroup f130407a;

    /* renamed from: b */
    private C23528a f130408b;

    /* renamed from: c */
    private AvatarImageView[] f130409c;

    /* renamed from: d */
    private C30120xa f130410d;

    /* renamed from: vd.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C27970a(ViewGroup viewGroup, C23528a c23528a) {
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f130407a = viewGroup;
        this.f130408b = c23528a;
        m140964a();
    }

    /* renamed from: a */
    private final void m140964a() {
        C30120xa c30120xa;
        this.f130410d = C30120xa.m148699c(LayoutInflater.from(this.f130407a.getContext()), this.f130407a, true);
        AvatarImageView[] avatarImageViewArr = new AvatarImageView[3];
        for (int i11 = 0; i11 < 3; i11++) {
            AvatarImageView avatarImageView = null;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 && (c30120xa = this.f130410d) != null) {
                        avatarImageView = c30120xa.f139938u;
                    }
                } else {
                    C30120xa c30120xa2 = this.f130410d;
                    if (c30120xa2 != null) {
                        avatarImageView = c30120xa2.f139937t;
                    }
                }
            } else {
                C30120xa c30120xa3 = this.f130410d;
                if (c30120xa3 != null) {
                    avatarImageView = c30120xa3.f139936s;
                }
            }
            avatarImageViewArr[i11] = avatarImageView;
        }
        this.f130409c = avatarImageViewArr;
    }

    /* renamed from: c */
    private final void m140965c(AvatarImageView avatarImageView, ContactProfile contactProfile) {
        C23528a c23528a;
        C23528a c23528a2;
        if (avatarImageView == null) {
            return;
        }
        if (this.f130408b == null) {
            this.f130408b = new C23528a(this.f130407a.getContext());
        }
        String str = contactProfile.f42446v;
        AbstractC19074t.m100207e(str, "avt");
        if (str.length() == 0 || C23302b.f113247a.m120523d(contactProfile.f42446v)) {
            int m12307a = C2343e.m12307a(contactProfile.f42434r, false);
            String m118087g = AbstractC23028c0.m118087g(contactProfile.m40383Q(true, false));
            AbstractC19074t.m100207e(m118087g, "getInitialShortNameByName(...)");
            C16640q2 mo88412f = C16640q2.m88404a().mo88412f(m118087g, m12307a);
            C23528a c23528a3 = this.f130408b;
            if (c23528a3 != null && (c23528a = (C23528a) c23528a3.m123612r(avatarImageView)) != null) {
            }
        } else {
            C23528a c23528a4 = this.f130408b;
            if (c23528a4 != null && (c23528a2 = (C23528a) c23528a4.m123612r(avatarImageView)) != null) {
            }
        }
        avatarImageView.setVisibility(0);
    }

    /* renamed from: b */
    public final boolean m140966b() {
        View view;
        C30120xa c30120xa = this.f130410d;
        if (c30120xa == null || (view = c30120xa.f139939v) == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void m140967d(boolean z11) {
        int i11;
        ViewGroup viewGroup = this.f130407a;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        viewGroup.setVisibility(i11);
    }

    /* renamed from: e */
    public final void m140968e(List list) {
        FrameLayout frameLayout;
        RobotoTextView robotoTextView;
        RobotoTextView robotoTextView2;
        AvatarImageView avatarImageView;
        AvatarImageView avatarImageView2;
        List list2 = list;
        FrameLayout frameLayout2 = null;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            int min = Math.min(size, 3);
            for (int i11 = 0; i11 < min; i11++) {
                AvatarImageView[] avatarImageViewArr = this.f130409c;
                if (avatarImageViewArr != null) {
                    avatarImageView2 = avatarImageViewArr[i11];
                } else {
                    avatarImageView2 = null;
                }
                m140965c(avatarImageView2, (ContactProfile) list.get(i11));
            }
            if (min < 3) {
                while (min < 3) {
                    AvatarImageView[] avatarImageViewArr2 = this.f130409c;
                    if (avatarImageViewArr2 != null && (avatarImageView = avatarImageViewArr2[min]) != null) {
                        avatarImageView.setVisibility(8);
                    }
                    min++;
                }
            }
            if (size > 3) {
                C30120xa c30120xa = this.f130410d;
                if (c30120xa != null && (robotoTextView2 = c30120xa.f139940w) != null) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("+%d", Arrays.copyOf(new Object[]{Integer.valueOf(size - 3)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    robotoTextView2.setText(format);
                    robotoTextView2.setVisibility(0);
                }
            } else {
                C30120xa c30120xa2 = this.f130410d;
                if (c30120xa2 != null) {
                    robotoTextView = c30120xa2.f139940w;
                } else {
                    robotoTextView = null;
                }
                if (robotoTextView != null) {
                    robotoTextView.setVisibility(8);
                }
            }
            C30120xa c30120xa3 = this.f130410d;
            if (c30120xa3 != null) {
                frameLayout2 = c30120xa3.f139934q;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
                return;
            }
            return;
        }
        C30120xa c30120xa4 = this.f130410d;
        if (c30120xa4 != null && (frameLayout = c30120xa4.f139934q) != null && frameLayout.getVisibility() == 0) {
            C30120xa c30120xa5 = this.f130410d;
            if (c30120xa5 != null) {
                frameLayout2 = c30120xa5.f139934q;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: f */
    public final void m140969f(boolean z11) {
        View view;
        int i11;
        C30120xa c30120xa = this.f130410d;
        if (c30120xa != null) {
            view = c30120xa.f139939v;
        } else {
            view = null;
        }
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }
}
