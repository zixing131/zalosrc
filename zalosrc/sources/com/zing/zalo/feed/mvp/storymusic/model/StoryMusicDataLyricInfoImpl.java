package com.zing.zalo.feed.mvp.storymusic.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import fn0.AbstractC19074t;
import kr.InterfaceC21911b;

/* loaded from: classes4.dex */
public final class StoryMusicDataLyricInfoImpl implements InterfaceC21911b, Parcelable {
    public static final Parcelable.Creator<StoryMusicDataLyricInfoImpl> CREATOR = new C8772a();

    /* renamed from: p */
    private boolean f47054p;

    /* renamed from: q */
    private LyricRender f47055q;

    /* renamed from: r */
    private StoryMusicAttachment f47056r;

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataLyricInfoImpl$a */
    /* loaded from: classes4.dex */
    public static final class C8772a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoryMusicDataLyricInfoImpl createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new StoryMusicDataLyricInfoImpl(parcel.readInt() != 0, LyricRender.CREATOR.createFromParcel(parcel), StoryMusicAttachment.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoryMusicDataLyricInfoImpl[] newArray(int i11) {
            return new StoryMusicDataLyricInfoImpl[i11];
        }
    }

    public StoryMusicDataLyricInfoImpl(boolean z11, LyricRender lyricRender, StoryMusicAttachment storyMusicAttachment) {
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        AbstractC19074t.m100208f(storyMusicAttachment, "visualAttachment");
        this.f47054p = z11;
        this.f47055q = lyricRender;
        this.f47056r = storyMusicAttachment;
    }

    @Override // bo.InterfaceC2992j2
    /* renamed from: a */
    public boolean mo14188a() {
        return this.f47054p;
    }

    @Override // kr.InterfaceC21911b
    /* renamed from: b */
    public StoryMusicAttachment mo46948b() {
        return this.f47056r;
    }

    @Override // bo.InterfaceC2992j2
    /* renamed from: c */
    public LyricRender mo14189c() {
        return this.f47055q;
    }

    /* renamed from: d */
    public void m46949d(boolean z11) {
        this.f47054p = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m46950e(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "<set-?>");
        this.f47055q = lyricRender;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryMusicDataLyricInfoImpl)) {
            return false;
        }
        StoryMusicDataLyricInfoImpl storyMusicDataLyricInfoImpl = (StoryMusicDataLyricInfoImpl) obj;
        return this.f47054p == storyMusicDataLyricInfoImpl.f47054p && AbstractC19074t.m100204b(this.f47055q, storyMusicDataLyricInfoImpl.f47055q) && AbstractC19074t.m100204b(this.f47056r, storyMusicDataLyricInfoImpl.f47056r);
    }

    /* renamed from: f */
    public void m46951f(StoryMusicAttachment storyMusicAttachment) {
        AbstractC19074t.m100208f(storyMusicAttachment, "<set-?>");
        this.f47056r = storyMusicAttachment;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f47054p) * 31) + this.f47055q.hashCode()) * 31) + this.f47056r.hashCode();
    }

    public String toString() {
        return "StoryMusicDataLyricInfoImpl(enableLyric=" + this.f47054p + ", lyricRender=" + this.f47055q + ", visualAttachment=" + this.f47056r + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeInt(this.f47054p ? 1 : 0);
        this.f47055q.writeToParcel(parcel, i11);
        this.f47056r.writeToParcel(parcel, i11);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ StoryMusicDataLyricInfoImpl(boolean r18, com.zing.zalo.feed.mvp.music.domain.entity.LyricRender r19, com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment r20, int r21, fn0.AbstractC19060k r22) {
        /*
            r17 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r18
        L8:
            r1 = r21 & 2
            if (r1 == 0) goto L13
            com.zing.zalo.feed.mvp.music.domain.entity.LyricRender$d r1 = com.zing.zalo.feed.mvp.music.domain.entity.LyricRender.Companion
            com.zing.zalo.feed.mvp.music.domain.entity.LyricRender r1 = r1.m45718c()
            goto L15
        L13:
            r1 = r19
        L15:
            r2 = r21 & 4
            if (r2 == 0) goto L31
            com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment r2 = new com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 127(0x7f, float:1.78E-43)
            r16 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r9, r11, r13, r15, r16)
            r3 = r17
            goto L35
        L31:
            r3 = r17
            r2 = r20
        L35:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.feed.mvp.storymusic.model.StoryMusicDataLyricInfoImpl.<init>(boolean, com.zing.zalo.feed.mvp.music.domain.entity.LyricRender, com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment, int, fn0.k):void");
    }
}
