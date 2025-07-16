package net.hollowcube.schem.util;

final class NoopGameDataProvider implements GameDataProvider {
    static GameDataProvider INSTANCE = new NoopGameDataProvider();

    @Override
    public int dataVersion() {
        return 4438; // 1.21.7
    }
}
