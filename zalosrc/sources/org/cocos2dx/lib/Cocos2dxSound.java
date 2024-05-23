package org.cocos2dx.lib;

import android.content.Context;
import android.media.SoundPool;
import com.chukong.cocosplay.client.CocosPlayClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class Cocos2dxSound {
    private static final int INVALID_SOUND_ID = -1;
    private static final int INVALID_STREAM_ID = -1;
    private static int LOAD_TIME_OUT = 500;
    private static final int MAX_SIMULTANEOUS_STREAMS_DEFAULT = 5;
    private static final int MAX_SIMULTANEOUS_STREAMS_I9100 = 3;
    private static final int SOUND_PRIORITY = 1;
    private static final int SOUND_QUALITY = 5;
    private static final float SOUND_RATE = 1.0f;
    private static final String TAG = "Cocos2dxSound";
    private final Context mContext;
    private float mLeftVolume;
    private float mRightVolume;
    private SoundPool mSoundPool;
    private final HashMap<String, ArrayList<Integer>> mPathStreamIDsMap = new HashMap<>();
    private final HashMap<String, Integer> mPathSoundIDMap = new HashMap<>();
    ConcurrentHashMap<Integer, SoundInfoForLoadedCompleted> mPlayWhenLoadedEffects = new ConcurrentHashMap<>();

    /* loaded from: classes7.dex */
    public class OnLoadCompletedListener implements SoundPool.OnLoadCompleteListener {
        public OnLoadCompletedListener() {
        }

        @Override // android.media.SoundPool.OnLoadCompleteListener
        public void onLoadComplete(SoundPool soundPool, int i11, int i12) {
            SoundInfoForLoadedCompleted soundInfoForLoadedCompleted;
            if (i12 == 0 && (soundInfoForLoadedCompleted = Cocos2dxSound.this.mPlayWhenLoadedEffects.get(Integer.valueOf(i11))) != null) {
                soundInfoForLoadedCompleted.effectID = Cocos2dxSound.this.doPlayEffect(soundInfoForLoadedCompleted.path, i11, soundInfoForLoadedCompleted.isLoop, soundInfoForLoadedCompleted.pitch, soundInfoForLoadedCompleted.pan, soundInfoForLoadedCompleted.gain);
                synchronized (soundInfoForLoadedCompleted) {
                    soundInfoForLoadedCompleted.notifyAll();
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class SoundInfoForLoadedCompleted {
        public int effectID = -1;
        public float gain;
        public boolean isLoop;
        public float pan;
        public String path;
        public float pitch;

        public SoundInfoForLoadedCompleted(String str, boolean z11, float f11, float f12, float f13) {
            this.path = str;
            this.isLoop = z11;
            this.pitch = f11;
            this.pan = f12;
            this.gain = f13;
        }
    }

    public Cocos2dxSound(Context context) {
        this.mContext = context;
        initData();
    }

    private float clamp(float f11, float f12, float f13) {
        return Math.max(f12, Math.min(f11, f13));
    }

    private void initData() {
        if (Cocos2dxHelper.getDeviceModel().contains("GT-I9100")) {
            this.mSoundPool = new SoundPool(3, 3, 5);
        } else {
            this.mSoundPool = new SoundPool(5, 3, 5);
        }
        this.mSoundPool.setOnLoadCompleteListener(new OnLoadCompletedListener());
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
    }

    public int createSoundIDFromAsset(String str) {
        int i11;
        try {
            if (str.startsWith("/")) {
                i11 = this.mSoundPool.load(str, 0);
            } else {
                i11 = this.mSoundPool.load(this.mContext.getAssets().openFd(str), 0);
            }
        } catch (Exception e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("error: ");
            sb2.append(e11.getMessage());
            i11 = -1;
        }
        if (i11 == 0) {
            return -1;
        }
        return i11;
    }

    int doPlayEffect(String str, int i11, boolean z11, float f11, float f12, float f13) {
        int i12;
        float clamp = this.mLeftVolume * f13 * (SOUND_RATE - clamp(f12, 0.0f, SOUND_RATE));
        float clamp2 = this.mRightVolume * f13 * (SOUND_RATE - clamp(-f12, 0.0f, SOUND_RATE));
        float clamp3 = clamp(f11 * SOUND_RATE, 0.5f, 2.0f);
        SoundPool soundPool = this.mSoundPool;
        float clamp4 = clamp(clamp, 0.0f, SOUND_RATE);
        float clamp5 = clamp(clamp2, 0.0f, SOUND_RATE);
        if (z11) {
            i12 = -1;
        } else {
            i12 = 0;
        }
        int play = soundPool.play(i11, clamp4, clamp5, 1, i12, clamp3);
        ArrayList<Integer> arrayList = this.mPathStreamIDsMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mPathStreamIDsMap.put(str, arrayList);
        }
        arrayList.add(Integer.valueOf(play));
        return play;
    }

    public void end() {
        this.mSoundPool.release();
        this.mPathStreamIDsMap.clear();
        this.mPathSoundIDMap.clear();
        this.mPlayWhenLoadedEffects.clear();
        this.mLeftVolume = 0.5f;
        this.mRightVolume = 0.5f;
        initData();
    }

    public float getEffectsVolume() {
        return (this.mLeftVolume + this.mRightVolume) / 2.0f;
    }

    public void onEnterBackground() {
        this.mSoundPool.autoPause();
    }

    public void onEnterForeground() {
        this.mSoundPool.autoResume();
    }

    public void pauseAllEffects() {
        if (!this.mPathStreamIDsMap.isEmpty()) {
            Iterator<Map.Entry<String, ArrayList<Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator<Integer> it2 = it.next().getValue().iterator();
                while (it2.hasNext()) {
                    this.mSoundPool.pause(it2.next().intValue());
                }
            }
        }
    }

    public void pauseEffect(int i11) {
        this.mSoundPool.pause(i11);
    }

    public int playEffect(String str, boolean z11, float f11, float f12, float f13) {
        Integer num = this.mPathSoundIDMap.get(str);
        if (num != null) {
            return doPlayEffect(str, num.intValue(), z11, f11, f12, f13);
        }
        Integer valueOf = Integer.valueOf(preloadEffect(str));
        if (valueOf.intValue() == -1) {
            return -1;
        }
        SoundInfoForLoadedCompleted soundInfoForLoadedCompleted = new SoundInfoForLoadedCompleted(str, z11, f11, f12, f13);
        this.mPlayWhenLoadedEffects.putIfAbsent(valueOf, soundInfoForLoadedCompleted);
        synchronized (soundInfoForLoadedCompleted) {
            try {
                soundInfoForLoadedCompleted.wait(LOAD_TIME_OUT);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        int i11 = soundInfoForLoadedCompleted.effectID;
        this.mPlayWhenLoadedEffects.remove(valueOf);
        return i11;
    }

    public int preloadEffect(String str) {
        if (CocosPlayClient.isEnabled() && !CocosPlayClient.isDemo()) {
            CocosPlayClient.updateAssets(str);
        }
        CocosPlayClient.notifyFileLoaded(str);
        Integer num = this.mPathSoundIDMap.get(str);
        if (num == null) {
            num = Integer.valueOf(createSoundIDFromAsset(str));
            if (num.intValue() != -1) {
                this.mPathSoundIDMap.put(str, num);
            }
        }
        return num.intValue();
    }

    public void resumeAllEffects() {
        if (!this.mPathStreamIDsMap.isEmpty()) {
            Iterator<Map.Entry<String, ArrayList<Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator<Integer> it2 = it.next().getValue().iterator();
                while (it2.hasNext()) {
                    this.mSoundPool.resume(it2.next().intValue());
                }
            }
        }
    }

    public void resumeEffect(int i11) {
        this.mSoundPool.resume(i11);
    }

    public void setEffectsVolume(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        if (f11 > SOUND_RATE) {
            f11 = SOUND_RATE;
        }
        this.mRightVolume = f11;
        this.mLeftVolume = f11;
        if (!this.mPathStreamIDsMap.isEmpty()) {
            Iterator<Map.Entry<String, ArrayList<Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator<Integer> it2 = it.next().getValue().iterator();
                while (it2.hasNext()) {
                    this.mSoundPool.setVolume(it2.next().intValue(), this.mLeftVolume, this.mRightVolume);
                }
            }
        }
    }

    public void stopAllEffects() {
        if (!this.mPathStreamIDsMap.isEmpty()) {
            Iterator<Map.Entry<String, ArrayList<Integer>>> it = this.mPathStreamIDsMap.entrySet().iterator();
            while (it.hasNext()) {
                Iterator<Integer> it2 = it.next().getValue().iterator();
                while (it2.hasNext()) {
                    this.mSoundPool.stop(it2.next().intValue());
                }
            }
        }
        this.mPathStreamIDsMap.clear();
    }

    public void stopEffect(int i11) {
        this.mSoundPool.stop(i11);
        for (String str : this.mPathStreamIDsMap.keySet()) {
            if (this.mPathStreamIDsMap.get(str).contains(Integer.valueOf(i11))) {
                this.mPathStreamIDsMap.get(str).remove(this.mPathStreamIDsMap.get(str).indexOf(Integer.valueOf(i11)));
                return;
            }
        }
    }

    public void unloadEffect(String str) {
        ArrayList<Integer> arrayList = this.mPathStreamIDsMap.get(str);
        if (arrayList != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                this.mSoundPool.stop(it.next().intValue());
            }
        }
        this.mPathStreamIDsMap.remove(str);
        Integer num = this.mPathSoundIDMap.get(str);
        if (num != null) {
            this.mSoundPool.unload(num.intValue());
            this.mPathSoundIDMap.remove(str);
        }
    }
}
