package com.zing.zalo.p077ui.mediastore.file;

import android.text.TextUtils;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.mediastore.InterfaceC12371j;
import com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter;
import com.zing.zalo.p077ui.mediastore.file.MediaStoreFilePagePresenter;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Arrays;
import mm0.AbstractC23350e;
import p363nh.C23744a;

/* loaded from: classes6.dex */
public final class MediaStoreFilePagePresenter extends MediaStorePagePresenter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreFilePagePresenter(InterfaceC12371j interfaceC12371j) {
        super(interfaceC12371j);
        AbstractC19074t.m100208f(interfaceC12371j, "mvpView");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Fr */
    public static final void m69490Fr(MediaStoreFilePagePresenter mediaStoreFilePagePresenter) {
        AbstractC19074t.m100208f(mediaStoreFilePagePresenter, "this$0");
        ((InterfaceC12371j) mediaStoreFilePagePresenter.m103742Dp()).mo68923ui();
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: Br */
    public void mo69038Br() {
        super.mo69038Br();
        C23744a.Companion.m124119a().m124117e(this, 117);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, com.zing.zalo.p077ui.mediastore.InterfaceC12370i
    /* renamed from: Jy */
    public boolean mo69047Jy(int i11) {
        if (i11 == AbstractC6918a0.action_bar_menu_more) {
            return true;
        }
        if (i11 == AbstractC6918a0.menu_change_layout_sub) {
            return false;
        }
        if (i11 == AbstractC6918a0.menu_multi_select) {
            return !mo69068fj();
        }
        return super.mo69047Jy(i11);
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 117) {
            try {
                if (objArr.length >= 2) {
                    Object obj = objArr[0];
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                    if (TextUtils.equals((String) obj, m69045Iq().m17608M())) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: a80.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                MediaStoreFilePagePresenter.m69490Fr(MediaStoreFilePagePresenter.this);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.mediastore.MediaStorePagePresenter
    /* renamed from: zr */
    public void mo69085zr() {
        super.mo69085zr();
        C23744a.Companion.m124119a().m124115b(this, 117);
    }
}
