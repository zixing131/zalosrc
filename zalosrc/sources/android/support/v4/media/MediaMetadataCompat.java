package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p665y0.C30239a;

/* loaded from: classes2.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: q */
    static final C30239a f3498q;

    /* renamed from: r */
    private static final String[] f3499r;

    /* renamed from: s */
    private static final String[] f3500s;

    /* renamed from: t */
    private static final String[] f3501t;

    /* renamed from: p */
    final Bundle f3502p;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes2.dex */
    static class C0973a implements Parcelable.Creator {
        C0973a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i11) {
            return new MediaMetadataCompat[i11];
        }
    }

    static {
        C30239a c30239a = new C30239a();
        f3498q = c30239a;
        c30239a.put("android.media.metadata.TITLE", 1);
        c30239a.put("android.media.metadata.ARTIST", 1);
        c30239a.put("android.media.metadata.DURATION", 0);
        c30239a.put("android.media.metadata.ALBUM", 1);
        c30239a.put("android.media.metadata.AUTHOR", 1);
        c30239a.put("android.media.metadata.WRITER", 1);
        c30239a.put("android.media.metadata.COMPOSER", 1);
        c30239a.put("android.media.metadata.COMPILATION", 1);
        c30239a.put("android.media.metadata.DATE", 1);
        c30239a.put("android.media.metadata.YEAR", 0);
        c30239a.put("android.media.metadata.GENRE", 1);
        c30239a.put("android.media.metadata.TRACK_NUMBER", 0);
        c30239a.put("android.media.metadata.NUM_TRACKS", 0);
        c30239a.put("android.media.metadata.DISC_NUMBER", 0);
        c30239a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c30239a.put("android.media.metadata.ART", 2);
        c30239a.put("android.media.metadata.ART_URI", 1);
        c30239a.put("android.media.metadata.ALBUM_ART", 2);
        c30239a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c30239a.put("android.media.metadata.USER_RATING", 3);
        c30239a.put("android.media.metadata.RATING", 3);
        c30239a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c30239a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c30239a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c30239a.put("android.media.metadata.DISPLAY_ICON", 2);
        c30239a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c30239a.put("android.media.metadata.MEDIA_ID", 1);
        c30239a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c30239a.put("android.media.metadata.MEDIA_URI", 1);
        c30239a.put("android.media.metadata.ADVERTISEMENT", 0);
        c30239a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f3499r = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f3500s = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f3501t = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0973a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f3502p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeBundle(this.f3502p);
    }
}
